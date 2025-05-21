package com.example.newsaggregator.domain.repository

import com.example.newsaggregator.domain.model.NewsItem
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    fun getNews(): Flow<List<NewsItem>>
    suspend fun refreshNews()
} 