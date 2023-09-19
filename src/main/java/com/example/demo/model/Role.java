package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
            @JoinTable(name = "user_role",joinColumns = {
                    @JoinColumn(name = "role_id")
            },inverseJoinColumns = {
                    @JoinColumn(name = "user_id")
            }
            )
    List<Client> clients;
public Role(){
    super();
}
    public Role(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
