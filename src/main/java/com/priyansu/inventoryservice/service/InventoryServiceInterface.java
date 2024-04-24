package com.priyansu.inventoryservice.service;

import com.priyansu.inventoryservice.model.Inventory;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface InventoryServiceInterface {
    public ResponseEntity<Optional<Inventory>> isInStock(String skuCode);
}
