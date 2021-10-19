package com.switchfully.controller;

import com.switchfully.model.Stock;
import com.switchfully.dto.StockDto;
import com.switchfully.mapper.StockMapper;
import com.switchfully.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/stocks")
public class StockExchangeController {

    private final StockService stockService;
    private final StockMapper stockMapper;

    @Autowired
    public StockExchangeController(StockService stockService, StockMapper stockMapper) {
        this.stockService = stockService;
        this.stockMapper = stockMapper;
    }

    @GetMapping("/{stockId}")
    public StockDto getStock(@PathVariable String stockId){
        Stock stock = stockService.getStock(stockId);
        return stockMapper.toDto(stock);
    }
}
