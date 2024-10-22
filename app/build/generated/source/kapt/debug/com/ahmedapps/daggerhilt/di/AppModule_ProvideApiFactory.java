package com.ahmedapps.daggerhilt.di;

import com.ahmedapps.daggerhilt.data.SomeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideApiFactory implements Factory<SomeApi> {
  @Override
  public SomeApi get() {
    return provideApi();
  }

  public static AppModule_ProvideApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SomeApi provideApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApiFactory INSTANCE = new AppModule_ProvideApiFactory();
  }
}
