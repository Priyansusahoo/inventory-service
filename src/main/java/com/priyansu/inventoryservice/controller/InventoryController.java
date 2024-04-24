package com.priyansu.inventoryservice.controller;


import com.priyansu.inventoryservice.model.Inventory;
import com.priyansu.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/isInStock")
    public ResponseEntity<Optional<Inventory>> isInStock(@RequestParam String skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
