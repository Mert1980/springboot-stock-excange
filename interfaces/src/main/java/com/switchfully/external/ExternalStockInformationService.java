package com.switchfully.external;

import com.switchfully.model.StockPrice;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {
    public BigDecimal getPriceInEuroForStock(String stockId) {
        return BigDecimal.valueOf(RandomUtils.nextDouble(10, 90));
    }
}
