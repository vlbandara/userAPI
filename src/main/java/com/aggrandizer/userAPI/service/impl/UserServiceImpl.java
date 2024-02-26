package com.aggrandizer.userAPI.service.impl;

import com.aggrandizer.userAPI.model.User;
import com.aggrandizer.userAPI.repository.UserRepository;
import com.aggrandizer.userAPI.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "success";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "success";
    }

    @Override
    public String deleteUser(int id) {
        userRepository.deleteById(String.valueOf(id));
        return "success";
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(String.valueOf(id)).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}


