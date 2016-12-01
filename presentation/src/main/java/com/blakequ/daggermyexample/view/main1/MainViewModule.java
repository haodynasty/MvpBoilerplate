package com.blakequ.daggermyexample.view.main1;

import android.support.annotation.NonNull;

import com.blakequ.daggermyexample.injection.ActivityScope;
import com.blakequ.daggermyexample.presenter.loader.PresenterFactory;

import dagger.Module;
import dagger.Provides;

@Module
public final class MainViewModule {

    @Provides
    @ActivityScope
    public PresenterFactory<MainPresenter> providePresenterFactory() {
        return new PresenterFactory<MainPresenter>() {
            @NonNull
            @Override
            public MainPresenter create() {
                System.out.println("---create presenter");
                return new MainPresenter();
            }
        };
    }

}
