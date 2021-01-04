package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepo;

import java.util.List;

public class UserService {

    UserRepo userRepo;

    public User getById(int id) {
        return userRepo.getById(id);
    }

    public List<User> getAllUsers() {
        return userRepo.getAll();
    }

    public void save(User entity) {
        userRepo.saveById(entity);
    }

    public void update(User entity) {
        userRepo.update(entity);
    }

    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
