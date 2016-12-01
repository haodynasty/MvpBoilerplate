package com.blakequ.daggermyexample.presenter.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.blakequ.daggermyexample.presenter.BasePresenter;
import com.blakequ.daggermyexample.presenter.BaseView;

/**
 * Abstract presenter implementation that contains base implementation for other presenters.
 * Subclasses must call super for all {@link BasePresenter} method overriding.
 */
public abstract class BasePresenterImpl<V extends BaseView> implements BasePresenter<V> {
    /**
     * The view
     */
    @Nullable
    private V mView;

    @Override
    public void onViewAttached(@NonNull V view) {
        mView = view;
    }


    @Override
    public void onStart(boolean firstStart) {

    }

    @Override
    public void onStop() {

    }


    @Override
    public void onViewDetached() {
        mView = null;
    }

    @Override
    public void onPresenterDestroyed() {

    }

    public boolean isViewAttached() {
        return mView != null;
    }

    public V getView() {
        return mView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
