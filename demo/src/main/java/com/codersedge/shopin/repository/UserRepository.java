package com.codersedge.shopin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codersedge.shopin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
}