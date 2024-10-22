package com.ahmedapps.daggerhilt;

import java.lang.System;

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ahmedapps/daggerhilt/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ahmedapps/daggerhilt/domain/repository/Repository;", "repository2", "(Lcom/ahmedapps/daggerhilt/domain/repository/Repository;Lcom/ahmedapps/daggerhilt/domain/repository/Repository;)V", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.ahmedapps.daggerhilt.domain.repository.Repository repository = null;
    private final com.ahmedapps.daggerhilt.domain.repository.Repository repository2 = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "api1")
    com.ahmedapps.daggerhilt.domain.repository.Repository repository, @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "api2")
    com.ahmedapps.daggerhilt.domain.repository.Repository repository2) {
        super();
    }
}