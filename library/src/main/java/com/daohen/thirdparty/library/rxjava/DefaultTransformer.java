package com.daohen.thirdparty.library.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.annotations.NonNull;
import retrofit2.Response;

/**
 * CREATE BY DAOHEN
 * EMAIL: alunfeixue2011@gmail.com
 * DATE : 2017/08/02 23:48
 */

public class DefaultTransformer<R extends BaseResponse> implements ObservableTransformer<Response<R>, R> {

    @Override
    public ObservableSource<R> apply(@NonNull Observable<Response<R>> upstream) {
        return upstream
                .compose(new SchedulerTransformer<Response<R>>())
                .compose(new ErrorCheckerTransformer<Response<R>, R>());
    }
}
