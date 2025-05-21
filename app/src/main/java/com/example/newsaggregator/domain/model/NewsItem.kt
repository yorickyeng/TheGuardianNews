package com.example.newsaggregator.domain.model

data class NewsItem(
    val title: String,
    val description: String,
    val link: String,
    val guid: String,
    val pubDate: String,
    val imageUrl: String?,
    val categories: List<String>,
    val author: String?,
    val dcDate: String
) 