package com.adduserapi.adduserapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adduserapi.adduserapi.model.User;
import com.adduserapi.adduserapi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;
    
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return service.searchUser(null);
    }

    // ADD USER
    @PostMapping("/add")
    public Map<String, Object> addUser(@RequestBody User user){

        if(user.getUsername() == null || user.getFirstName() == null ||
           user.getLastName() == null || user.getPassword() == null) {
            throw new RuntimeException("Validation failed");
        }

        User savedUser = service.addUser(user);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "Success");
        response.put("userId", savedUser.getId());

        return response;
    }

    // SEARCH USER
    @PostMapping("/search")
    public List<User> searchUsers(@RequestBody User user){
        return service.searchUser(user);
    }
}