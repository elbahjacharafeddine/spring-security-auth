package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.Role;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public  ResponseEntity<List<Client>> getAllUsers(){
        try {
             List<Client> list = clientService.getAllClient();
            return ResponseEntity.ok(list);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ArrayList<>());
        }
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody Client user){
        try{
//            List<Role> role = user.getRole();
//            List<Role> roles = roleService.getAllRoles();
//            List<Role> listRoles =new ArrayList<>();
//            for (Role r : role){
//                for (Role rol : roles){
//                    if (r.getName().equals(rol.getName()) ){
//                        System.out.println("Yes we have the equals");
//                        listRoles.add(r);
//                        break;
//                    }
//                }
//            }
//            user.setRole(listRoles);
            clientService.create(user);
            return  ResponseEntity.ok("account created with success");
        }
        catch (Exception e){
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error try again");
        }
    }
}
