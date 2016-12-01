package com.blakequ.data.injection.module;

import android.app.Service;

import com.blakequ.data.injection.ServiceScope;

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
 * date     : 2016/11/30 15:35 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */
@Module
public class ServiceModule {
    private Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

    @Provides
    @ServiceScope
    public Service provideContext() {
        return mService;
    }
}
