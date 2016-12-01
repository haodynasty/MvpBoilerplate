package com.blakequ.data.database;

import android.content.Context;

import com.blakequ.data.injection.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

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
 * date     : 2016/11/30 20:57 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description: 数据库访问助手
 */
@Singleton
public class DatabaseHelper {

    @Inject
    public DatabaseHelper(@ApplicationContext Context context){

    }
}
