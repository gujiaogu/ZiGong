package com.uestc.zigong.base;

/**
 * Created by Tyrese on 2018/4/10.
 */

public class BaseModel {

    protected ApiService apiService;

    public BaseModel() {
        apiService = ServiceSingleton.getService();
    }
}
