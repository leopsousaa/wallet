package org.wallet.entity;


import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Data
@Table(name = "users") // No h2 user é reservado.
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
}
