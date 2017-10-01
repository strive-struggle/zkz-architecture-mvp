package com.zkz.architecture.mvp.contract;

import com.zkz.architecture.mvp.model.entity.UserInfo;
import com.zkz.architecture.mvp.view.LoginActivity;

/**
 * 登录view、presenter、model的契约类
 * Created by Zhangkui on 2017/9/30.
 */
public class LoginContract {

    /**
     * 登录View层接口
     */
    public interface ILoginView extends IBaseView {

    }

    /**
     * 登录Presenter层接口
     */
    public interface ILoginPresenter extends IBasePresenter<LoginActivity> {
        void login(UserInfo userInfo);

        void logout(UserInfo userInfo);
    }

}
