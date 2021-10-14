package com.switchfully.repository;

import com.google.common.collect.ImmutableMap;
import com.switchfully.model.Stock;

import java.util.Map;

public class StockRepositoryImpl implements StockRepository {

    static final Map<String, Stock> stockMap =
            new ImmutableMap.Builder<String, Stock>()
                    .put("AA", new Stock("AA", "book"))
                    .put("BB", new Stock("BB", "laptop"))
                    .put("CC", new Stock("CC", "table"))
                    .build();

    @Override
    public Stock getStockInformation(String stockId) {
        if(!stockMap.containsKey(stockId)){
            throw new StockNotFoundException(stockId);
        }
        return stockMap.get(stockId);
    }
}
