package com.blakequ.data.injection.component;

import android.app.Activity;
import android.content.Context;

import com.blakequ.data.injection.ActivityContext;
import com.blakequ.data.injection.ActivityScope;
import com.blakequ.data.injection.module.ActivityModule;

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
 * date     : 2016/11/18 17:09 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description: 它可以被继承使用
 */
@ActivityScope //限定作用域为activity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    @ActivityContext
    Context getContext();
}
