package com.blakequ.daggermyexample.view.main;

import com.blakequ.daggermyexample.bean.BeanA;
import com.blakequ.daggermyexample.injection.ActivityScope;
import com.blakequ.daggermyexample.injection.component.ActivityComponent;
import com.blakequ.daggermyexample.injection.component.AppComponent;
import com.blakequ.daggermyexample.injection.module.ActivityModule;

import dagger.Component;

/**
 * Copyright (C) BlakeQu All Rights Reserved <blakequ@gmail.com>
 * <p>
 * Licensed under the blakequ.com License, Version 1.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * author  : quhao <blakequ@gmail.com> <br>
 * date     : 2016/11/30 15:13 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */
@ActivityScope
@Component(dependencies = AppComponent.class,
        modules = {ActivityModule.class, BeanAModule.class})
public interface MainActivityComponent extends ActivityComponent { //可以继承使用ActivityComponent，效果就相当于普通接口继承而已，但是不建议这样使用

    void inject(MainActivity activity);

    //这里ToastHelper的构造函数必须要有Inject
    ToastHelper getToastHelper();

    @ForSex("boy")
    BeanA getBeanA();
}
