package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public String getAllUsers(){
        return "hello world from spring boot";
    }


    @PostMapping("/save")
    public String saveUser(Client user){
        userRepository.save(user);
        System.out.println("saved with succes");
        return "saved with success";
    }
}
