package com.mobilium.vitrin.service;

import java.util.List;

import com.mobilium.vitrin.pojos.Result;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Requests {

    @GET("discover")
    Call<List<Result>> getDiscover();
}
