package com.binance.api.client.domain.account;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FundingAsset {
    String asset;
    BigDecimal free;
    BigDecimal locked;
    BigDecimal freeze;
    BigDecimal withdrawing;
    BigDecimal btcValuation;
}
