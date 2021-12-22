package com.binance.api.client.domain.account.futures;

public enum FuturesTransferType {
    FROM_SPOT_TO_USDTM("1"),
    FROM_USDTM_TO_SPOT("2"),
    FROM_SPOT_TO_COINM("3"),
    FROM_COINM_TO_SPOT("4");

    private String value;

    FuturesTransferType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}