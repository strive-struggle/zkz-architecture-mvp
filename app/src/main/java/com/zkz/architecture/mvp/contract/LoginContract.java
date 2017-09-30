package com.zkz.architecture.mvp.contract;

import com.zkz.architecture.mvp.view.LoginActivity;

/**
 * 登录view、presenter、model的契约类
 * Created by Zhangkui on 2017/9/30.
 */
public class LoginContract {

    public interface ILoginView extends IBaseView {

    }

    public interface ILoginPresenter extends IBasePresenter<LoginActivity> {

    }

}
