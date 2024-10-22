package com.ahmedapps.daggerhilt.di;

import java.lang.System;

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/ahmedapps/daggerhilt/di/AppModule;", "", "()V", "provideApi", "Lcom/ahmedapps/daggerhilt/data/SomeApi;", "provideApi2", "Lcom/ahmedapps/daggerhilt/data/SomeApi2;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.ahmedapps.daggerhilt.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.ahmedapps.daggerhilt.data.SomeApi provideApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.ahmedapps.daggerhilt.data.SomeApi2 provideApi2() {
        return null;
    }
}