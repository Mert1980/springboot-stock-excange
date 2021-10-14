package com.switchfully.model;

import java.math.BigDecimal;

public class StockPrice {

    private BigDecimal price;
    private StockCurrency currency;

    public StockPrice(BigDecimal price, StockCurrency currency) {
        this.price = price;
        this.currency = currency;
    }

    public void setCurrency(StockCurrency currency) {
        this.currency = currency;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public enum StockCurrency{
        EUR("Euro", "€"),
        USD("Dollar", "$"),
        GBP("Pound", "£");

        private String label;
        private String symbol;

        StockCurrency(String label, String symbol) {
            this.label = label;
            this.symbol = symbol;
        }
    }
}


