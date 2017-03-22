package com.codersedge.shopin.service;

import java.util.Collection;
import java.util.Optional;

import com.codersedge.shopin.dto.UserCreateForm;
import com.codersedge.shopin.model.User;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}