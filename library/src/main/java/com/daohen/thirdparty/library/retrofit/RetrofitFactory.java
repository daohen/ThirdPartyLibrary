package com.daohen.thirdparty.library.retrofit;

import com.daohen.thirdparty.library.okhttp.OkHttpFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * CREATE BY ALUN
 * EMAIL: alunfeixue2011@gmail.com
 * DATA : 2017/07/12 22:15
 */
public class RetrofitFactory {

    //REMIND:注意 有待构建更可控的Retrofit

    public static Retrofit getDefault(String url){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .client(OkHttpFactory.getDefault())
                .build();
    }

}
