package com.example.newsaggregator.ui.viewmodel;

import com.example.newsaggregator.domain.repository.NewsRepository;
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
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<NewsRepository> repositoryProvider;

  public NewsViewModel_Factory(Provider<NewsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<NewsRepository> repositoryProvider) {
    return new NewsViewModel_Factory(repositoryProvider);
  }

  public static NewsViewModel newInstance(NewsRepository repository) {
    return new NewsViewModel(repository);
  }
}
