package com.xzy.adapter_rxjava2;

import retrofit2.Call;

/**
 * @author: carbon dioxide
 * @time: 2021/4/25 16:24
 */
public class MyNetThrowable extends Throwable {

    public final Call call;

    public MyNetThrowable(Throwable e, Call call) {
        super(e);
        this.call = call;
    }

    public Call getCall() {
        return call;
    }
}

