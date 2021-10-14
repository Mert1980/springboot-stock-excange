package com.switchfully.controller;


import com.switchfully.model.Stock;
import com.switchfully.dto.StockDto;
import com.switchfully.mapper.StockMapper;
import com.switchfully.service.StockService;
import com.switchfully.service.StockServiceImpl;

public class StockExchangeController {

    StockService stockService = new StockServiceImpl();

    public StockDto getStock(String stockId){
        Stock stock = stockService.getStock(stockId);
        return StockMapper.toDto(stock);
    }
}
