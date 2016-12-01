package com.blakequ.daggermyexample.injection.module;

import android.content.Context;
import android.support.annotation.NonNull;

import com.blakequ.daggermyexample.App;
import com.blakequ.daggermyexample.injection.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public final class AppModule {
    @NonNull
    private final App mApp;

    public AppModule(@NonNull App app) {
        mApp = app;
    }

    @ApplicationContext
    @Provides
    @Singleton
    public Context provideAppContext() {
        return mApp;
    }

    @Provides
    @Singleton
    public App provideApp() {
        return mApp;
    }
}
