package com.blakequ.daggermyexample.view.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.blakequ.daggermyexample.App;
import com.blakequ.daggermyexample.R;
import com.blakequ.daggermyexample.bean.BeanA;
import com.blakequ.daggermyexample.bean.BeanB;
import com.blakequ.daggermyexample.injection.module.ActivityModule;
import com.blakequ.daggermyexample.view.main1.Main2Activity;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    private MainActivityComponent activityComponent;

    @ForSex("boy")
    @Inject
    BeanA mBeanA;

    @ForSex("boy")
    @Inject
    BeanA mBeanA1;

    @ForSex("girl") //使用BeanA的地方必须使用标记，否则无法通过编译
    @Inject
    BeanA mBeanA2;

    //简单的注入方式，直接使用构造函数，在BeanB的构造函数直接使用Inject（必须要有Component连接器，否则无法注入）
    @Inject
    BeanB mBeanB;

    //三种加载方式：普通(一般用法)，懒加载,provider，具体区别见Lazy的说明

    //懒加载
    @Inject
    Lazy<BeanB> lazyBean;

    //provide加载
    @Inject
    Provider<BeanB> providerBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityComponent = DaggerMainActivityComponent.builder()
                .appComponent(((App) getApplication()).getAppComponent())
                .activityModule(new ActivityModule(this))
                .build();
        activityComponent.inject(this);

        System.out.println("---bean:"+mBeanA.getName()+" "+mBeanA);
        System.out.println("---bean:"+mBeanA1.getName()+" "+mBeanA1);
        System.out.println("---bean:"+activityComponent.getBeanA().getName()+" "+activityComponent.getBeanA());

        System.out.println("---bean:"+mBeanA2.getName()+" "+mBeanA2);

        //正常加载
        System.out.println("---beanB:"+mBeanB);

        //懒加载，只有get的时候才生成实例
        System.out.println("---lazy:"+lazyBean.get());

        //provider加载
        System.out.println("---provider:"+providerBean.get());

        activityComponent.getToastHelper().showToast("收完了");

        findViewById(R.id.bt_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
