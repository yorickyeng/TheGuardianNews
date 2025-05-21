package com.example.newsaggregator.data.repository

import com.example.newsaggregator.data.rss.RssFeed
import com.example.newsaggregator.domain.model.NewsItem
import com.example.newsaggregator.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val rssFeed: RssFeed
) : NewsRepository {

    override fun getNews(): Flow<List<NewsItem>> = flow {
        val response = rssFeed.getRss()
        val newsItems = response.channel.items.map { item ->
            NewsItem(
                title = item.title,
                description = item.description,
                link = item.link,
                guid = item.guid,
                pubDate = item.pubDate,
                imageUrl = item.contents.firstOrNull()?.url,
                categories = item.categories.map { it.value },
                author = item.dcCreator,
                dcDate = item.dcDate
            )
        }
        emit(newsItems)
    }

    override suspend fun refreshNews() {
        rssFeed.getRss()
    }
} 