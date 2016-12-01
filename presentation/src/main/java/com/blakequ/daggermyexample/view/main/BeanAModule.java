package com.blakequ.daggermyexample.view.main;

import com.blakequ.daggermyexample.bean.BeanA;
import com.blakequ.daggermyexample.injection.ActivityScope;

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
 * date     : 2016/11/24 10:04 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */
@Module
public class BeanAModule {

    public BeanAModule(){
    }

//    @Named("1")
    @ForSex("boy") //同@Named
    @Provides
    @ActivityScope //component关联的Model中的任何一个被构造的对象有scope，则该整个component要加上这个scope,因此BeanComponent必须也要加上ActivityScope这个域限定符
    BeanA providesBeanBoy(){
        return new BeanA("boy");
    }

//    @Named("2")
    @ForSex("girl")
    @Provides
    BeanA providesBeanGirl(){
        return new BeanA("girl");
    }
}
