package com.example.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name="TasksU")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int id;

    @Column(name = "tasks")
    private String tasks;

    @Column(name="status")
    private String status;



    @ManyToOne
    @JoinColumn(name = "ID")
    private Users user;

}
