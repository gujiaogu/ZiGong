package com.uestc.zigong.presenter;

import com.uestc.zigong.contract.LoginContract;
import com.uestc.zigong.model.LoginModel;

/**
 * Created by Tyrese on 2018/4/10.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginModel mLoginModel;
    private LoginContract.View mLoginView;

    @Override
    public void takeView(LoginContract.View view) {

    }

    @Override
    public void dropView() {

    }

    @Override
    public void login() {

    }
}
