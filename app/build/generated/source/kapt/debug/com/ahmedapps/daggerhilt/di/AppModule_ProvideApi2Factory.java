package com.ahmedapps.daggerhilt.di;

import com.ahmedapps.daggerhilt.data.SomeApi2;
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
public final class AppModule_ProvideApi2Factory implements Factory<SomeApi2> {
  @Override
  public SomeApi2 get() {
    return provideApi2();
  }

  public static AppModule_ProvideApi2Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SomeApi2 provideApi2() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApi2());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApi2Factory INSTANCE = new AppModule_ProvideApi2Factory();
  }
}
