package com.projeto.pizzaria.demo.service;

import com.projeto.pizzaria.demo.entity.User;
import com.projeto.pizzaria.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String password) {
        if (username == null || password == null) {;
            throw new IllegalArgumentException("Username and password cannot be null");
       }User user  = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public User getUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }
}



