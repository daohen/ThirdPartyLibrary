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

public class ErrorCheckerTransformer<T extends Response<R>, R> implements ObservableTransformer<T, R> {
    @Override
    public ObservableSource<R> apply(@NonNull Observable<T> upstream) {
        return upstream.map(new Function<T, R>() {
            @Override
            public R apply(@NonNull T t) throws Exception {
                // TODO: 2017/8/3 错误状态的待处理
                return t.body();
            }
        });
    }
}
