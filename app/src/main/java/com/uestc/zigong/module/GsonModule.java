package com.uestc.zigong.module;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tyrese on 2018/4/10.
 */

@Module
public class GsonModule {

    @Singleton
    @Provides
    public Gson provideGson() {
        return new Gson();
    }
}
