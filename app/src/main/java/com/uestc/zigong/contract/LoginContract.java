package com.uestc.zigong.contract;

import com.uestc.zigong.base.BasePresenter;
import com.uestc.zigong.base.BaseView;

/**
 * Created by Tyrese on 2018/4/10.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void showProgressDiallog();
        void dismiss();
    }

    interface Presenter extends BasePresenter<View> {
        void login();
    }
}
