package com.homeinventory.backend.controllers;

import com.homeinventory.backend.models.InventoryItem;
import com.homeinventory.backend.repositories.InventoryItemJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/home-inventory")
public class HomeInventoryController {

    @Autowired
    private InventoryItemJpaRepository jpaRepository;

    @GetMapping("")
    public List<InventoryItem> listInventoryItems(){
        return jpaRepository.findAll();
    }

    @PostMapping("")
    public InventoryItem createInventoryItem(@RequestBody InventoryItem inventoryItem){
        return jpaRepository.save(inventoryItem);
    }

}
