package com.ahmedapps.daggerhilt.di;

import java.lang.System;

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/ahmedapps/daggerhilt/di/RepositoryModule;", "", "()V", "bindRepository1", "Lcom/ahmedapps/daggerhilt/domain/repository/Repository;", "repositoryImpl", "Lcom/ahmedapps/daggerhilt/data/RepositoryImpl;", "bindRepository2", "repositoryImpl2", "Lcom/ahmedapps/daggerhilt/data/RepositoryImpl2;", "app_debug"})
@dagger.Module
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "api1")
    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.ahmedapps.daggerhilt.domain.repository.Repository bindRepository1(@org.jetbrains.annotations.NotNull
    com.ahmedapps.daggerhilt.data.RepositoryImpl repositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "api2")
    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.ahmedapps.daggerhilt.domain.repository.Repository bindRepository2(@org.jetbrains.annotations.NotNull
    com.ahmedapps.daggerhilt.data.RepositoryImpl2 repositoryImpl2);
}