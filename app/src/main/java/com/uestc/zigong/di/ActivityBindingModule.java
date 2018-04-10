package com.uestc.zigong.di;

import com.uestc.zigong.MainActivity;
import com.uestc.zigong.module.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Tyrese on 2018/4/10.
 */

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivity();

}
