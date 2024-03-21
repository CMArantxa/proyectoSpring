package com.ceica.proyectospring.repository;

import com.ceica.proyectospring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
