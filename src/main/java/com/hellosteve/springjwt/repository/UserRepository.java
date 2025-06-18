package com.hellosteve.springjwt.repository;

import com.hellosteve.springjwt.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findAllByUsername(String Username);
}
