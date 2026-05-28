package com.example.testproguard.test6.base.presenter;

import com.example.testproguard.test6.base.view.IBaseMvpView;

/**
 * MVP公共Presenter
 */
public class BaseMultiPartMvpPresenter<V extends IBaseMvpView> extends BaseMvpPresenter<V> {

    private static final String TAG = BaseMultiPartMvpPresenter.class.getSimpleName();

    public BaseMultiPartMvpPresenter(V view) {
        super(view);
    }

}
