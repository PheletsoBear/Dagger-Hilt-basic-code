package com.ahmedapps.daggerhilt.data;

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
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<SomeApi> apiProvider;

  public RepositoryImpl_Factory(Provider<SomeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<SomeApi> apiProvider) {
    return new RepositoryImpl_Factory(apiProvider);
  }

  public static RepositoryImpl newInstance(SomeApi api) {
    return new RepositoryImpl(api);
  }
}
