package com.daohen.thirdparty.library.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import retrofit2.Response;

/**
 * CREATE BY DAOHEN
 * EMAIL: alunfeixue2011@gmail.com
 * DATE : 2017/08/03 00:14
 */

public class ErrorCheckerTransformer<R extends BaseResponse> implements ObservableTransformer<Response<R>, R> {

    @Override
    public ObservableSource<R> apply(@NonNull Observable<Response<R>> upstream) {
        return upstream.map(new Function<Response<R>, R>() {
            @Override
            public R apply(@NonNull Response<R> rResponse) throws Exception {
                return rResponse.body();
            }
        });
    }
}
