package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private  UserService userService;

   @GetMapping("/users")

    public List<User> getAllUsers(){
       return userService.getAllUsers();
   }
    @GetMapping("/users/{id}")

    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

}
