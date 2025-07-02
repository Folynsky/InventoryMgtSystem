package com.inventorysystem.InventoryMgtSystem.repositories;

import com.inventorysystem.InventoryMgtSystem.models.Product;
import com.inventorysystem.InventoryMgtSystem.models.Supplier;
import com.inventorysystem.InventoryMgtSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
