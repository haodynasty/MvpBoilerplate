package com.blakequ.daggermyexample.view.main;

import android.content.Context;
import android.widget.Toast;

import com.blakequ.daggermyexample.injection.ApplicationContext;

import javax.inject.Inject;

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
 * date     : 2016/11/22 20:56 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description:
 */

public class ToastHelper {

    private Context context;

    //Context是从ActivityModule中获取
    @Inject
    ToastHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    //@Inject
    //Utils utils;
    Toast toast = null;

    public void showToast(CharSequence text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else {
            toast.setText(text);
        }
        toast.show();
    }
}
