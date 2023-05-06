package com.mongodb.Mongodb.controllers;

import com.mongodb.Mongodb.entities.User;
import com.mongodb.Mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id){
        Optional<User> user = userService.getUserById(id);
        return user;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return createdUser;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void UpdateUser(@PathVariable String id,@RequestBody User user){
        userService.updateUser(user, id);
    }
}
