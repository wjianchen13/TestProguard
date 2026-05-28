package com.example.testproguard.test6.base.presenter

import com.example.testproguard.test6.base.view.IBaseMvpView

/**
 * MVP公共Presenter
 */
open class BaseMultiPartMvpPresenter<V : IBaseMvpView?>(view: V) : BaseMvpPresenter<V>(view) {
    companion object {
        private val TAG: String = BaseMultiPartMvpPresenter::class.java.simpleName
    }
}
