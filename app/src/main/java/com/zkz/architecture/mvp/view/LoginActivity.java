package com.zkz.architecture.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zkz.architecture.mvp.R;
import com.zkz.architecture.mvp.contract.LoginContract;
import com.zkz.architecture.mvp.presenter.LoginPresenterImp;

public class LoginActivity extends BaseActivity implements LoginContract.ILoginView {

    LoginPresenterImp presenterImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * 界面初始化
     */
    private void initView() {
        presenterImp = new LoginPresenterImp();
        presenterImp.attachView(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenterImp.detachView();
    }
}
