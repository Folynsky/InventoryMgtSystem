package com.inventorysystem.InventoryMgtSystem.repositories;

import com.inventorysystem.InventoryMgtSystem.models.Category;
import com.inventorysystem.InventoryMgtSystem.models.Product;
import com.inventorysystem.InventoryMgtSystem.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {
}
