package com.app.retrofitdata.Instance;

import com.app.retrofitdata.ApiInterface.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static String api="https://jsonplaceholder.typicode.com";
    static RetrofitInstance instance;
    public ApiInterface apiInterface;
    RetrofitInstance(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface=    retrofit.create(ApiInterface.class);
    }

    public static RetrofitInstance getInstance()
    {
        if(instance==null){
            instance = new RetrofitInstance();
        }
        return instance;
    }
}
