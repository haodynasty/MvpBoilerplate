package com.blakequ.daggermyexample.view.main1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.blakequ.daggermyexample.R;
import com.blakequ.daggermyexample.adapter.RibotsAdapter;
import com.blakequ.daggermyexample.bean.BeanData;
import com.blakequ.daggermyexample.injection.component.AppComponent;
import com.blakequ.daggermyexample.presenter.loader.PresenterFactory;
import com.blakequ.daggermyexample.util.DialogFactory;
import com.blakequ.daggermyexample.base.BaseActivity;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public final class Main2Activity extends BaseActivity<MainPresenter, MainContract.View> implements MainContract.View {
    @Inject
    PresenterFactory<MainPresenter> mPresenterFactory;
    @Inject
    RibotsAdapter mRibotsAdapter;

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    // Your presenter is available using the mPresenter variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);

        // Your code here
        // Do not call mPresenter from here, it will be null! Wait for onStart or onPostCreate.
        mRecyclerView.setAdapter(mRibotsAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerMainViewComponent.builder()
                .appComponent(parentComponent)
                .mainViewModule(new MainViewModule())
                .build()
                .inject(this);
    }

    @NonNull
    @Override
    protected PresenterFactory<MainPresenter> getPresenterFactory() {
        return mPresenterFactory;
    }

    /***** MVP View methods implementation *****/

    @Override
    public void showList(List<BeanData> datas) {
        mRibotsAdapter.setRibots(datas);
        mRibotsAdapter.notifyDataSetChanged();
    }

    @Override
    public void showError() {
        DialogFactory.createGenericErrorDialog(this, getString(R.string.error_loading_ribots))
                .show();
    }

    @Override
    public void showListEmpty() {
        mRibotsAdapter.setRibots(Collections.<BeanData>emptyList());
        mRibotsAdapter.notifyDataSetChanged();
        Toast.makeText(this, "data is empty", Toast.LENGTH_LONG).show();
    }
}
