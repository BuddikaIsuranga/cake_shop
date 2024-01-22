package com.ijse.cakeshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.cakeshop.entity.User;



@Service
public interface UserService {

List<User> getAllUsers();
User createUser(User user);
User getUserById(Long id);


}


