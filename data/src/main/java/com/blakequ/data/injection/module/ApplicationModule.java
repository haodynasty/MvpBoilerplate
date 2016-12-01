package com.blakequ.data.injection.module;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.blakequ.data.injection.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

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
 * date     : 2016/11/30 20:42 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */
@Module
public class ApplicationModule {
    @NonNull
    private final Application mApp;

    public ApplicationModule(@NonNull Application app) {
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
    public Application provideApp() {
        return mApp;
    }
}
