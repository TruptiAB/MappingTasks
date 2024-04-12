package com.example.service;

import com.example.Model.Tasks;


import java.util.List;

public interface TaskService {
    List<Tasks> findAllT();

    Tasks saveT(Tasks task);

    Tasks update(Tasks tasks, int id);

    void delete(int id);

}
