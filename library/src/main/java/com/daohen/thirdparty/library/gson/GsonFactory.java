package com.daohen.thirdparty.library.gson;

import com.daohen.personal.toolbox.library.Singleton;
import com.google.gson.Gson;

/**
 * CREATE BY ALUN
 * EMAIL: alunfeixue2011@gmail.com
 * DATA : 2017/07/15 22:38
 */
public class GsonFactory {

    public static Gson getGson(){
        return new Gson();
    }

    public static Gson getDefault(){
        return gDefault.get();
    }

    private static final Singleton<Gson> gDefault = new Singleton<Gson>() {
        @Override
        protected Gson create() {
            return getGson();
        }
    };
}
