package com.uestc.zigong.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Tyrese on 2018/4/10.
 */

@Module
public abstract class ApplicationModule {
    @Binds
    abstract Context inject(Application application);
}
