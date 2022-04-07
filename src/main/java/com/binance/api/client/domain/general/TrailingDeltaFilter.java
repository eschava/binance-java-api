package com.binance.api.client.domain.general;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TrailingDeltaFilter extends SymbolFilter {

  int minTrailingAboveDelta;
  int maxTrailingAboveDelta;
  int minTrailingBelowDelta;
  int maxTrailingBelowDelta;

}
