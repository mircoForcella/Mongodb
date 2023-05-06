package com.mongodb.Mongodb.service;

import com.mongodb.Mongodb.entities.User;
import com.mongodb.Mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id){
        return userRepository.findById(id);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    public void updateUser(User user, String id){
        Optional<User> checkUser = userRepository.findById(id);
        if(checkUser.isPresent()){
            user.setId(checkUser.get().getId());
            user.setFirstName(checkUser.get().getFirstName());
            user.setLastName(checkUser.get().getLastName());
            userRepository.save(user);
        }
    }
}
