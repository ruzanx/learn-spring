package com.codersedge.shopin.service;

import com.codersedge.shopin.model.CurrentUser;

public interface CurrentUserService {
    boolean canAccessUser(CurrentUser currentUser, Long userId);
}