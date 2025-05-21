package com.example.newsaggregator.di;

import com.example.newsaggregator.data.rss.RssFeed;
import com.example.newsaggregator.domain.repository.NewsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideNewsRepositoryFactory implements Factory<NewsRepository> {
  private final Provider<RssFeed> rssFeedProvider;

  public AppModule_ProvideNewsRepositoryFactory(Provider<RssFeed> rssFeedProvider) {
    this.rssFeedProvider = rssFeedProvider;
  }

  @Override
  public NewsRepository get() {
    return provideNewsRepository(rssFeedProvider.get());
  }

  public static AppModule_ProvideNewsRepositoryFactory create(Provider<RssFeed> rssFeedProvider) {
    return new AppModule_ProvideNewsRepositoryFactory(rssFeedProvider);
  }

  public static NewsRepository provideNewsRepository(RssFeed rssFeed) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsRepository(rssFeed));
  }
}
