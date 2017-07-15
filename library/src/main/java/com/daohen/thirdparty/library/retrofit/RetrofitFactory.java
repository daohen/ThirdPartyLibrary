package com.daohen.thirdparty.library.retrofit;

import com.daohen.thirdparty.library.okhttp.OkHttpClientFactory;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
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
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpClientFactory.getDefault())
                .build();
    }

}
