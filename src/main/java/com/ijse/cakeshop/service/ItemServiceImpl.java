package com.ijse.cakeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.cakeshop.entity.Item;
import com.ijse.cakeshop.repository.ItemRepository;

@Service

public class ItemServiceImpl implements ItemService {

    @Autowired ItemRepository itemRepository;

    @Override
     public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItemById(Long itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item updateItem(Long itemId, Item item) {
        Item existingItem = itemRepository.findById(itemId).orElse(null);

        
        if(existingItem != null) {
            existingItem.setItemName(item.getItemName());
            existingItem.setItemName(item.getItemName());
            existingItem.setDescription(item.getDescription());
            existingItem.setPrice(item.getPrice());
            existingItem.setDescription(item.getDescription());
            existingItem.setQty(item.getQty());
            return itemRepository.save(existingItem);
        } else {
            return null;
        }
    }
    
}
