package com.jwt.example.services;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Vivek sharma","vivek@wealthmax.co.uk"));
        store.add(new User(UUID.randomUUID().toString(),"Aman sharma","aman@wealthmax.co.uk"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit sharma","ankit@wealthmax.co.uk"));
        store.add(new User(UUID.randomUUID().toString(),"Goutam sharma","goutam@wealthmax.co.uk"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
