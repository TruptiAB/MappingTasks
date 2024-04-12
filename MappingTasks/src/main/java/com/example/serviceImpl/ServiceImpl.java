package com.example.serviceImpl;



import com.example.Model.Users;

import com.example.repository.UserRepo;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceImpl implements UserService  {
    @Autowired
    UserRepo userrepo;

    @Override
    public List<Users> FindAllUser() {
        return userrepo.findAll();
    }
    @Override
    public Users createUser(Users users) {
        return userrepo.save(users);
    }
    @Override
    public Users updateUser(Users users, int id) {
        return null;
    }
    @Override
    public void deleteUser(int id) {

    }
}
