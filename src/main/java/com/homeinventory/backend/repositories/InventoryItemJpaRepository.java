package com.homeinventory.backend.repositories;

import com.homeinventory.backend.models.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryItemJpaRepository extends JpaRepository<InventoryItem, Long> {
}
