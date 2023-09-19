package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/all")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @PostMapping("/save")
    public ResponseEntity<String> create(@RequestBody Role role){
        try{
            roleService.create(role);
            return ResponseEntity.ok("role created with success");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error try again");
        }
    }
}
