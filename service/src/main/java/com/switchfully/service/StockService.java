package com.switchfully.service;

import com.switchfully.model.Stock;
import org.springframework.stereotype.Service;

@Service
public interface StockService {
    Stock getStock(String stockId);
}
