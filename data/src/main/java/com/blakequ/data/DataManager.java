package com.blakequ.data;

import com.blakequ.data.database.DatabaseHelper;
import com.blakequ.data.file.FileHelper;
import com.blakequ.data.preferences.PreferencesHelper;
import com.blakequ.data.remote.RemoteHelper;

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
 * date     : 2016/11/30 20:31 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description: 暴露的数据管理器，对外唯一数据接口，数据来源（网络，数据库，文件等）
 */
@Singleton
public class DataManager {

    private final RemoteHelper mRemoteHelper;
    private final DatabaseHelper mDatabaseHelper;
    private final PreferencesHelper mPreferencesHelper;
    private final FileHelper mFileHelper;

    @Inject
    public DataManager(RemoteHelper ribotsService, PreferencesHelper preferencesHelper,
                       DatabaseHelper databaseHelper, FileHelper fileHelper) {
        mRemoteHelper = ribotsService;
        mPreferencesHelper = preferencesHelper;
        mDatabaseHelper = databaseHelper;
        mFileHelper = fileHelper;
    }

    public PreferencesHelper getPreferencesHelper() {
        return mPreferencesHelper;
    }

    public DatabaseHelper getDatabaseHelper(){
        return mDatabaseHelper;
    }

    public RemoteHelper getRemoteHelper(){
        return mRemoteHelper;
    }

    public FileHelper getFileHelper(){
        return mFileHelper;
    }
}
