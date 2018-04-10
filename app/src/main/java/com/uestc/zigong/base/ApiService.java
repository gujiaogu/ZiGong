package com.uestc.zigong.base;

import com.uestc.zigong.enitity.LoginEntity;
import com.uestc.zigong.enitity.ResultEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({
            "Accept: application/json;charset=UTF-8",
    })
    @GET("service/getIpInfo.php")
    Call<ResultEntity<LoginEntity>> login(@Query("ip") String ip);

}
