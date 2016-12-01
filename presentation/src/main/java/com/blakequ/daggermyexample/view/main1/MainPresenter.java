package com.blakequ.daggermyexample.view.main1;

import com.blakequ.daggermyexample.bean.BeanData;
import com.blakequ.daggermyexample.injection.ActivityScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

@ActivityScope
public class MainPresenter extends MainContract.Presenter {

    private int index = 0;

    // The view is available using the mView variable

    @Inject
    public MainPresenter() {
    }

    @Override
    public void onStart(boolean firstStart) {
        super.onStart(firstStart);

        // Your code here. Your view is available using mView and will not be null until next onStop()
        loadData();
    }

    @Override
    public void onStop() {
        // Your code here, mView will be null after this method until next onStart()

        super.onStop();
    }

    @Override
    public void onPresenterDestroyed() {
        /*
         * Your code here. After this method, your presenter (and view) will be completely destroyed
         * so make sure to cancel any HTTP call or database connection
         */

        super.onPresenterDestroyed();
    }

    @Override
    public void loadData() {
        checkViewAttached();
        //通过网络，数据库等途径加载数据
        System.out.println("======index:"+index);
        if (index == 0){
            List<BeanData> datas = new ArrayList<>();
            datas.add(new BeanData("#334455", "name1", "email1"));
            datas.add(new BeanData("#678723", "name34", "ema222il1"));
            datas.add(new BeanData("#213796", "name322", "email13333"));
            datas.add(new BeanData("#ffff45", "name1213", "email3341"));
            getView().showList(datas);
        }else if (index == 1){
            getView().showError();
        }else {
            getView().showListEmpty();
        }
        index++;
    }

    @Override
    public void destoryData() {

    }
}