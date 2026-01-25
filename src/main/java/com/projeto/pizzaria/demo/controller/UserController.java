package com.projeto.pizzaria.demo.controller;


import com.projeto.pizzaria.demo.entity.User;
import com.projeto.pizzaria.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user) {
        user = service.createUser(user.getUsername(), user.getPassword());
        return ResponseEntity.ok().body(user);

    }
}
