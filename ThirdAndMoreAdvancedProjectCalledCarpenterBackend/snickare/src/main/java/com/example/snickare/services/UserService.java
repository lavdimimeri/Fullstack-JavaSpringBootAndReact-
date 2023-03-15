package com.example.snickare.services;

import com.example.snickare.daos.UserRepo;
import com.example.snickare.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
   UserRepo userRepo;

    public User getUserById(int id){
       return userRepo.findById(id).get();
    }

    public List<User> getAllUsers(){
       List<User> users = new ArrayList<>();
       userRepo.findAll().forEach(user->users.add(user));
       return users;
    }

    public void saveUser(User user){
        userRepo.save(user);
    }

    public void updateUser(User userUpdate){
        userRepo.save(userUpdate);
    }
    public void deleteUserById(int id){
        userRepo.deleteById(id);
    }
}
