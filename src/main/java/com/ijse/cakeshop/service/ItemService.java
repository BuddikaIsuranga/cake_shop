package com.ijse.cakeshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.cakeshop.entity.Item;

@Service
public interface ItemService {
    List<Item> getAllItems();
    Item getItemById(Long itemId);
    Item createItem(Item item);
    Item updateItem(Long itemId, Item item);
    
}
