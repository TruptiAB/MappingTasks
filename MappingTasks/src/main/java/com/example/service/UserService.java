package com.example.service;

import com.example.Model.Tasks;
import com.example.Model.Users;

import java.util.List;

public interface UserService {
    List<Users> FindAllUser();

    Users createUser(Users users);

    Users updateUser(Users users, int id);

    void deleteUser(int id);
}
