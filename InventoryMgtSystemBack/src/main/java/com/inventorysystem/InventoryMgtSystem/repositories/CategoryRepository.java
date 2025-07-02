package com.inventorysystem.InventoryMgtSystem.repositories;

import com.inventorysystem.InventoryMgtSystem.models.Category;
import com.inventorysystem.InventoryMgtSystem.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}
