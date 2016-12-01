package com.blakequ.daggermyexample.presenter.loader;

import android.support.annotation.NonNull;

import com.blakequ.daggermyexample.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
