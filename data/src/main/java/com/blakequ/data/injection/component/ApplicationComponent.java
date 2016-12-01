package com.blakequ.data.injection.component;

import android.app.Application;
import android.content.Context;

import com.blakequ.data.DataManager;
import com.blakequ.data.injection.ApplicationContext;
import com.blakequ.data.injection.module.ApplicationModule;
import com.blakequ.data.util.RxEventBus;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(Application application);

    @ApplicationContext
    Context getAppContext();

    Application getApp();

    DataManager dataManager();
    RxEventBus eventBus();
}