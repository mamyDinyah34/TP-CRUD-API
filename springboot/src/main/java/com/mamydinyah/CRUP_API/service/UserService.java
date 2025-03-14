package com.mamydinyah.CRUP_API.service;

import com.mamydinyah.CRUP_API.entity.User;
import com.mamydinyah.CRUP_API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public User userById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        user.setCreatedAt(new Date());
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        user.setUpdatedAt(new Date());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
