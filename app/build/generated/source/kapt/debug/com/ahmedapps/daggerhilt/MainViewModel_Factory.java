package com.ahmedapps.daggerhilt;

import com.ahmedapps.daggerhilt.domain.repository.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<Repository> repository2Provider;

  public MainViewModel_Factory(Provider<Repository> repositoryProvider,
      Provider<Repository> repository2Provider) {
    this.repositoryProvider = repositoryProvider;
    this.repository2Provider = repository2Provider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get(), repository2Provider.get());
  }

  public static MainViewModel_Factory create(Provider<Repository> repositoryProvider,
      Provider<Repository> repository2Provider) {
    return new MainViewModel_Factory(repositoryProvider, repository2Provider);
  }

  public static MainViewModel newInstance(Repository repository, Repository repository2) {
    return new MainViewModel(repository, repository2);
  }
}
