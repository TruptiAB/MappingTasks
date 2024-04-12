package com.example.serviceImpl;

import com.example.Model.Tasks;
import com.example.repository.TaskRepo;

import com.example.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class serviceImplTasks implements TaskService {
    @Autowired
    public TaskRepo taskRepo;



    public List<Tasks> findAllT() {
        return  taskRepo.findAll();
    }

    @Override
    public Tasks update(Tasks tasks, int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }


    public Tasks saveT(Tasks task) {
        return taskRepo.save(task);
    }


    }
