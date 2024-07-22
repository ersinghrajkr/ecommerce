package com.learning.ecommerce.service;

import com.learning.ecommerce.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(String id);
    User saveUser(User user);
    void deleteUser(String id);
}
