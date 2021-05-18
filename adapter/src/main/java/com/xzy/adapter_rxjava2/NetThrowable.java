package com.xzy.adapter_rxjava2;

import retrofit2.Call;

public class NetThrowable extends Throwable {

    public final Call call;

    public NetThrowable(Throwable e, Call call) {
        super(e);
        this.call = call;
    }

    public Call getCall() {
        return call;
    }
}

