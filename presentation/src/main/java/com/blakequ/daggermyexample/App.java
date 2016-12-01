package com.blakequ.daggermyexample;

import android.app.Application;
import android.support.annotation.NonNull;

import com.blakequ.daggermyexample.injection.component.AppComponent;
import com.blakequ.daggermyexample.injection.component.DaggerAppComponent;
import com.blakequ.daggermyexample.injection.module.AppModule;

public final class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mAppComponent.inject(this);
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}