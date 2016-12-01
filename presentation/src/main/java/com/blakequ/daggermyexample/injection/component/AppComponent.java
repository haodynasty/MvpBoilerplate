package com.blakequ.daggermyexample.injection.component;

import android.content.Context;

import com.blakequ.daggermyexample.App;
import com.blakequ.daggermyexample.injection.ApplicationContext;
import com.blakequ.daggermyexample.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(App application);

    @ApplicationContext
    Context getAppContext();

    App getApp();
}