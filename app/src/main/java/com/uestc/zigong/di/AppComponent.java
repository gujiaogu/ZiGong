package com.uestc.zigong.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

/**
 * Created by Tyrese on 2018/4/10.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class, ActivityBindingModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication>{

    @Component.Builder
    public abstract class Builder extends AndroidInjector.Builder<DaggerApplication>{}
}
