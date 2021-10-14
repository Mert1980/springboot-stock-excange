package com.switchfully.service;

import com.switchfully.external.ExternalStockInformationService;
import com.switchfully.model.Stock;
import com.switchfully.repository.StockRepository;
import com.switchfully.repository.StockRepositoryImpl;

public class StockServiceImpl implements StockService {

    StockRepository stockRepository = new StockRepositoryImpl();
    ExternalStockInformationService externalStockInformationService = new ExternalStockInformationService();

    // TODO What if no Stock could be found for the given stockId? The method needs to return a Stock, so what will we return?
    public Stock getStock(String stockId){
        Stock stock = stockRepository.getStockInformation(stockId);
        stock.getPrice().setPrice(externalStockInformationService.getPriceInEuroForStock(stockId));
        return stock;
    }
}
