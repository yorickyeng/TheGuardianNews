package com.example.newsaggregator.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsaggregator.domain.model.NewsItem
import com.example.newsaggregator.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val repository: NewsRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow<NewsUiState>(NewsUiState.Loading)
    val uiState: StateFlow<NewsUiState> = _uiState

    init {
        loadNews()
    }

    fun loadNews() {
        viewModelScope.launch {
            _uiState.value = NewsUiState.Loading
            repository.getNews()
                .catch { e ->
                    _uiState.value = NewsUiState.Error(e.message ?: "Unknown error occurred")
                }
                .collect { news ->
                    _uiState.value = NewsUiState.Success(news)
                }
        }
    }

    fun refreshNews() {
        viewModelScope.launch {
            try {
                _uiState.value = NewsUiState.Loading
                repository.refreshNews()
                repository.getNews()
                    .catch { e ->
                        _uiState.value = NewsUiState.Error(e.message ?: "Failed to refresh news")
                    }
                    .collect { news ->
                        _uiState.value = NewsUiState.Success(news)
                    }
            } catch (e: Exception) {
                _uiState.value = NewsUiState.Error(e.message ?: "Failed to refresh news")
            }
        }
    }
}

sealed class NewsUiState {
    data object Loading : NewsUiState()
    data class Success(val news: List<NewsItem>) : NewsUiState()
    data class Error(val message: String) : NewsUiState()
} 