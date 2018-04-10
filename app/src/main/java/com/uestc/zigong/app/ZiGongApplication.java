package com.uestc.zigong.app;

import com.uestc.zigong.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created by Tyrese on 2018/4/10.
 */

public class ZiGongApplication extends DaggerApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
