package com.projeto.pizzaria.repository;

import com.projeto.pizzaria.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
    User findByUsername(String username);
}
