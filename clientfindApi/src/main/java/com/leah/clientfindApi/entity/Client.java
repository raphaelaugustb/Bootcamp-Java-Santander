package com.leah.clientfindApi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String age;
    @ManyToOne
    private Address adress;

    public Client() {
    }

    public Client(Long id, String name, String email, String age, Address adress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.adress = adress;
    }
}
