package com.homeinventory.backend.controllers;

import com.homeinventory.backend.models.InventoryItem;
import com.homeinventory.backend.repositories.InventoryItemJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/home-inventory")
public class HomeInventoryController {

    @Autowired
    private InventoryItemJpaRepository jpaRepository;

    @GetMapping("")
    public List<InventoryItem> listRecipes(){
        return jpaRepository.findAll();
    }

}
