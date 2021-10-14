package com.switchfully.model;

public class Stock {

    private String id;
    private String name;
    private StockPrice price;

    public Stock(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public StockPrice getPrice() {
        return price;
    }

    public void setPrice(StockPrice price) {
        this.price = price;
    }
}
