package com.blakequ.data.injection.module;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.blakequ.data.injection.ActivityContext;
import com.blakequ.data.injection.ActivityScope;

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
 * date     : 2016/11/18 17:04 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(@NonNull Activity activity){
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    Activity providesActivity(){
        return mActivity;
    }

    @Provides
    @NonNull
    @ActivityContext
    @ActivityScope
    Context providesContext() {
        return mActivity;
    }
}
