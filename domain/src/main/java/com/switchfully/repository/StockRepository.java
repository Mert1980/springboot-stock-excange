package com.switchfully.repository;

import com.switchfully.model.Stock;

public interface StockRepository {
    Stock getStockInformation(String stockId);
}
