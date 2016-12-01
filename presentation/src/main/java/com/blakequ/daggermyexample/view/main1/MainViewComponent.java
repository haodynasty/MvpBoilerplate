package com.blakequ.daggermyexample.view.main1;

import com.blakequ.daggermyexample.injection.ActivityScope;
import com.blakequ.daggermyexample.injection.component.AppComponent;
import com.blakequ.daggermyexample.injection.module.ActivityModule;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, MainViewModule.class})
public interface MainViewComponent {
    void inject(Main2Activity activity);
}