package com.aggrandizer.userAPI.service;

import com.aggrandizer.userAPI.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public String createUser(User user);
    public String updateUser(User user);
    public String deleteUser(String id);
    public User getUser(String id);
    public List<User> getAllUsers();
}
