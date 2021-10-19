package com.switchfully.external;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {
    public BigDecimal getPriceInEuroForStock(String stockId) {
        return BigDecimal.valueOf(RandomUtils.nextDouble(10, 90));
    }
}
