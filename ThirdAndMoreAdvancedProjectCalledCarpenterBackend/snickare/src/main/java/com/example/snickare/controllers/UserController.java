package com.example.snickare.controllers;

import com.example.snickare.models.User;
import com.example.snickare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController // This means that this class is a Controller
@RequestMapping(path="/users")
public class UserController {

@Autowired
 UserService userService;

    @PostMapping(path="/add")
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userService.getAllUsers();
    }


    @DeleteMapping(path="/all/{id}")
    public void deleteUserById(@PathVariable("id") int id){
        userService.deleteUserById(id);
    }

    @PutMapping(path="/all/{id}")
    public void updateUser(@RequestBody User user){

        userService.updateUser(user);
    }

    @GetMapping(path="/all/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }
}
