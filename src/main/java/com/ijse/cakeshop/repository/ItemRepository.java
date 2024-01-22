package com.ijse.cakeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.cakeshop.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    
}
