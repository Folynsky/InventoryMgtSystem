package com.inventorysystem.InventoryMgtSystem.repositories;

import com.inventorysystem.InventoryMgtSystem.models.Product;
import com.inventorysystem.InventoryMgtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
