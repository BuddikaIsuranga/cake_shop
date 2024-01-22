package com.ijse.cakeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.cakeshop.entity.Item;
import com.ijse.cakeshop.service.ItemService;

@RestController
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    @GetMapping("/Items")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping("/Items")
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @GetMapping("/Items/{ItemId}")
    public Item getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

   
       @PutMapping("/Items/{ItemId}")
    public Item updateItem(@PathVariable Long itemId, @RequestBody Item item) {
        return itemService.updateItem(itemId, item);
    }
    
    
}
