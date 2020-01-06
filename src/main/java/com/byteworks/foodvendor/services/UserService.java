package com.byteworks.foodvendor.services;

import com.byteworks.foodvendor.models.User;

public interface UserService {
    User findUserById(String id);
    User registerUser(User user);
    User findUserByUsername(String username);
}
