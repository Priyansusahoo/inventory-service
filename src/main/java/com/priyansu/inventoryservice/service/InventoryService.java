package com.priyansu.inventoryservice.service;

import com.priyansu.inventoryservice.model.Inventory;
import com.priyansu.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService implements InventoryServiceInterface {

    private final InventoryRepository inventoryRepository;

    @Override
    public ResponseEntity<Optional<Inventory>> isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode();
    }
}
