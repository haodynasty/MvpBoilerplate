package com.blakequ.daggermyexample.injection.component;

import android.app.Service;

import com.blakequ.daggermyexample.injection.ServiceScope;
import com.blakequ.daggermyexample.injection.module.ServiceModule;

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
 * date     : 2016/11/30 15:38 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */
@ServiceScope
@Component(dependencies = AppComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
    Service getService();
}
