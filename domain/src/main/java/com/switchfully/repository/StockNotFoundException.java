package com.switchfully.repository;

public class StockNotFoundException extends RuntimeException {
    public StockNotFoundException(String stockId) {
        super("Stock ID:" + stockId + " is not in stock.");
    }
}
