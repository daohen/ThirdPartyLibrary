package com.daohen.thirdparty.library.rxjava;

import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * CREATE BY ALUN
 * EMAIL: alunfeixue2011@gmail.com
 * DATE : 2017/08/16 10:02
 */

public abstract class SingleDefaultObserver<T> implements SingleObserver<T> {
    @Override
    public void onSubscribe(@NonNull Disposable d) {
    }
}
