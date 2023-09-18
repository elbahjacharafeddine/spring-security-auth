package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public String getAllUsers(){
        return "hello world from spring boot";
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveUser(Client user){
        try{
            clientService.create(user);
            return  ResponseEntity.ok("compte create with success");
        }
        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error try again");
        }
    }
}
