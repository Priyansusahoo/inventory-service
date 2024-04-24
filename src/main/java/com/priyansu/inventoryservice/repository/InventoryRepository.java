package com.priyansu.inventoryservice.repository;

import com.priyansu.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    ResponseEntity<Optional<Inventory>> findBySkuCode();
}
