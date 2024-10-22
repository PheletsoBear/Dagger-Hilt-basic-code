package com.ahmedapps.daggerhilt.data;

import android.app.Application;
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
    "rawtypes"
})
public final class RepositoryImpl2_Factory implements Factory<RepositoryImpl2> {
  private final Provider<SomeApi2> apiProvider;

  private final Provider<Application> applicationProvider;

  public RepositoryImpl2_Factory(Provider<SomeApi2> apiProvider,
      Provider<Application> applicationProvider) {
    this.apiProvider = apiProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public RepositoryImpl2 get() {
    return newInstance(apiProvider.get(), applicationProvider.get());
  }

  public static RepositoryImpl2_Factory create(Provider<SomeApi2> apiProvider,
      Provider<Application> applicationProvider) {
    return new RepositoryImpl2_Factory(apiProvider, applicationProvider);
  }

  public static RepositoryImpl2 newInstance(SomeApi2 api, Application application) {
    return new RepositoryImpl2(api, application);
  }
}
