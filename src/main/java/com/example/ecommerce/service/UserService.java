package com.example.ecommerce.service;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public Optional<User> getUserById(Long id) {
        // Logic to retrieve user by ID from the data layer
        return userRepository.findById(id);
         // Placeholder for actual implementation
    }
}