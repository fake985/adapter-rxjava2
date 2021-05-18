package com.xzy.adapter_rxjava2;

import retrofit2.Call;

public class BaseResult {
    private Call call;

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }
}
