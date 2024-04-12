package com.example.controller;


import com.example.Model.Users;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    public UserService  userService;



    @GetMapping("/getAllT")
    public List<Users> FindAllUser() {
        System.out.println("userService = " + userService);
        return userService.FindAllUser();
    }

    @PostMapping("/tasks")

    public Users save(
            @RequestBody Users users) {
        return userService.createUser(users);
    }


//    @PostMapping
//    public ResponseEntity<Parent> createParent(@RequestBody Parent parent) {
//        Parent savedParent = parentService.saveParent(parent);
//        return new ResponseEntity<>(savedParent, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Parent>> getAllParents() {
//        List<Parent> parents = parentService.getAllParents();
//        return new ResponseEntity<>(parents, HttpStatus.OK);
//    }



    @PutMapping("/task/{id}")

    public Users
    update(@RequestBody Users users,
           @PathVariable("id") int id)
    {
        return userService.updateUser(
                users, id);
    }


    @DeleteMapping("/task/{id}")

    public String delete(@PathVariable("id")
                         int id)
    {
        userService.deleteUser(
                id);
        return "Deleted Successfully";
    }

}
