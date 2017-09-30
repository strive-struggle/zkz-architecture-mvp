package com.zkz.architecture.mvp.presenter;

import com.zkz.architecture.mvp.contract.LoginContract;
import com.zkz.architecture.mvp.view.LoginActivity;

/**
 * 登录逻辑Presenter层实现类
 * Created by Zhangkui on 2017/9/30.
 */
public class LoginPresenterImp implements LoginContract.ILoginPresenter {

    LoginActivity loginActivity;

    @Override
    public void attachView(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
    }

    @Override
    public void detachView() {
        loginActivity = null;
    }
}
