package com.codersedge.shopin.service;

import org.springframework.stereotype.Service;

import com.codersedge.shopin.model.CurrentUser;
import com.codersedge.shopin.model.Role;

@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }

}