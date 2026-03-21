package com.adduserapi.adduserapi.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adduserapi.adduserapi.model.User;
import com.adduserapi.adduserapi.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Add User
    public User addUser(User user) {
        return userRepository.save(user);
    }

    //Get all users
    public List<User> getAllUser(User user) {
        return userRepository.findAll(); 
    }
 // SEARCH users 
    public List<User> searchUser(User user) {
        return userRepository.findAll(); 
    }
   
    }
