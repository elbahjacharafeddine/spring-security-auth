package com.example.demo.service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client create(Client user){
        return clientRepository.save(user);
    }

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }
}
