package com.example.newsaggregator.data.repository;

import com.example.newsaggregator.data.rss.RssFeed;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NewsRepositoryImpl_Factory implements Factory<NewsRepositoryImpl> {
  private final Provider<RssFeed> rssFeedProvider;

  public NewsRepositoryImpl_Factory(Provider<RssFeed> rssFeedProvider) {
    this.rssFeedProvider = rssFeedProvider;
  }

  @Override
  public NewsRepositoryImpl get() {
    return newInstance(rssFeedProvider.get());
  }

  public static NewsRepositoryImpl_Factory create(Provider<RssFeed> rssFeedProvider) {
    return new NewsRepositoryImpl_Factory(rssFeedProvider);
  }

  public static NewsRepositoryImpl newInstance(RssFeed rssFeed) {
    return new NewsRepositoryImpl(rssFeed);
  }
}
