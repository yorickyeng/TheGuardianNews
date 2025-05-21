package com.example.newsaggregator.di;

import com.example.newsaggregator.data.rss.RssFeed;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideRssFeedFactory implements Factory<RssFeed> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideRssFeedFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RssFeed get() {
    return provideRssFeed(retrofitProvider.get());
  }

  public static AppModule_ProvideRssFeedFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideRssFeedFactory(retrofitProvider);
  }

  public static RssFeed provideRssFeed(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRssFeed(retrofit));
  }
}
