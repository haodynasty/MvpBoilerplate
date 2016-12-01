package com.blakequ.daggermyexample.view.main1;

import com.blakequ.daggermyexample.bean.BeanData;
import com.blakequ.daggermyexample.presenter.impl.BasePresenterImpl;
import com.blakequ.daggermyexample.presenter.BaseView;

import java.util.List;

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
 * date     : 2016/11/30 18:00 <br>
 * last modify author : <br>
 * version : 1.0 <br>
 * description: MVP模式的VP接口
 */

public interface MainContract {
    interface View extends BaseView{
        void showList(List<BeanData> datas);

        void showListEmpty();

        void showError();
    }

    abstract class Presenter extends BasePresenterImpl<View> {

        abstract void loadData();

        abstract void destoryData();
    }

    //or like this
//    interface Presenter2 extends BasePresenter<View>{
//        /**
//         * 载入数据
//         */
//        void loadData();
//
//        /**
//         * 销毁数据
//         */
//        void destoryData();
//    }
}
