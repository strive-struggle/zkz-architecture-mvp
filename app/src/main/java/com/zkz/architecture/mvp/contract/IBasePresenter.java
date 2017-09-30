package com.zkz.architecture.mvp.contract;

/**
 * Presenter层接口基类
 * Created by Zhangkui on 2017/9/30.
 */
public interface IBasePresenter<T> {

    void attachView(T t);

    void detachView();

}
