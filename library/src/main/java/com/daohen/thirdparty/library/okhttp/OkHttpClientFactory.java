package com.daohen.thirdparty.library.okhttp;

import android.content.Context;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * CREATE BY ALUN
 * EMAIL: alunfeixue2011@gmail.com
 * DATA : 2017/07/12 22:29
 */
public class OkHttpClientFactory {

    //REMIND:注意 有待构建更可控的OkHttpClick

    public static OkHttpClient getDefault(){
        return new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
    }

    public static class Builder{

        OkHttpClient.Builder builder;
        long connectTimeout = 30000;

        public Builder(){
            builder = new OkHttpClient.Builder();
        }

        public Builder addNetworkInterceptor(HttpLoggingInterceptor.Level level){
            builder.addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(level));
            return this;
        }

        public Builder addHeaderInterceptor(Map<String, String> headers){
            builder.addInterceptor(new HeaderInterceptor(headers));
            return this;
        }

        public Builder certificatePinner(Map<String, String> certificates){
            builder.certificatePinner(CertificatePinnerFactory.generate(certificates));
            return this;
        }

        public Builder connectTimeout(long second){
            this.connectTimeout = second;
            return this;
        }

        public Builder trustHttps(Context context, int[] certificates, String[] hostUrls, boolean isAllTrust){
            if (isAllTrust){
                builder.socketFactory(TrustHttpsFactory.getDefaultSSLSocketFactory());
                builder.hostnameVerifier(TrustHttpsFactory.getDefaultHostnameVerifier());
            } else {
                builder.socketFactory(TrustHttpsFactory.getSSLSocketFactory(context, certificates));
                builder.hostnameVerifier(TrustHttpsFactory.getHostnameVerifier(hostUrls));
            }
            return this;
        }

        public OkHttpClient build(){
            builder.connectTimeout(connectTimeout, TimeUnit.SECONDS);
            return builder.build();
        }

    }

}
