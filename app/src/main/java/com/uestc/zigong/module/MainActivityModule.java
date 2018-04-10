package com.uestc.zigong.module;

import com.uestc.zigong.presenter.TestPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tyrese on 2018/4/10.
 */

@Module
public class MainActivityModule {

    @Provides
    public static TestPresenter providePresenter() {
        return new TestPresenter();
    }
}
