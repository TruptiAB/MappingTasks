package com.example.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "UsersT")
public class Users  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_ID")
    private int id;

    @Column(name = "users")
    private String users;
    @OneToMany(cascade = CascadeType.ALL)

//    @OneToMany( mappedBy = "users", cascade =CascadeType.ALL)
//    @JoinColumn(name = "id_fk",referencedColumnName = "id")
    private List<Tasks> tasksList ;

}
