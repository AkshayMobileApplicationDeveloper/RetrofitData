package com.app.retrofitdata.ApiInterface;



import com.app.retrofitdata.Model.userModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/photos")
    Call<List<userModel>> getUser();
}
