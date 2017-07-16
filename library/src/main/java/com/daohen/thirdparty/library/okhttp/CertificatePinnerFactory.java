package com.daohen.thirdparty.library.okhttp;

import java.util.Map;
import java.util.Set;

import okhttp3.CertificatePinner;

/**
 * CREATE BY ALUN
 * EMAIL: alunfeixue2011@gmail.com
 * DATA : 2017/07/16 11:53
 */
public class CertificatePinnerFactory {

    public static CertificatePinner generate(Map<String, String> certificates){
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        if (certificates != null && certificates.size() > 0){
            Set<String> keys = certificates.keySet();
            for (String key : keys){
                builder.add(key, certificates.get(key));
            }
        }
        return builder.build();
    }

}
