package com.switchfully.controller;


import com.switchfully.model.Stock;
import com.switchfully.model.StockDto;
import com.switchfully.model.StockMapper;
import com.switchfully.service.StockService;
import com.switchfully.service.StockServiceImpl;

public class StockExchangeController {

    StockService stockService = new StockServiceImpl();

    public StockDto getStock(String stockId){
        Stock stock = stockService.getStock(stockId);
        return StockMapper.toDto(stock);
    }
}
