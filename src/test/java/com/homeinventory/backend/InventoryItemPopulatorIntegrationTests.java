package com.homeinventory.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.homeinventory.backend.models.InventoryItem;
import com.homeinventory.backend.repositories.InventoryItemJpaRepository;

@SpringBootTest
public class InventoryItemPopulatorIntegrationTests {

    @Autowired
    private InventoryItemJpaRepository jpaRepository;

    @Test
    void givenFruitJsonPopulatorThenShouldInsertRecordOnStart() {
        List<InventoryItem> items = jpaRepository.findAll();
        assertEquals(3, items.size(), "record count is not matching");

        items.forEach(item -> {
            if (1 == item.getId()) {
                assertEquals("LG Household Refrigerator", item.getName());
                assertEquals("LRFDS2016S /01", item.getModelNumber());
            } else if (2 == item.getId()) {
                assertEquals("LG Front Load Washer", item.getName());
                assertEquals("WM3600HWA /01", item.getModelNumber());
            } else if (3 == item.getId()) {
                assertEquals("LG Electric Dryer", item.getName());
                assertEquals("DLEX3700W", item.getModelNumber());
            }
        });
    }

}
