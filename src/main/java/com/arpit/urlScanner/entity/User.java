package com.arpit.urlScanner.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length=100)
    private String name;

    @Column(nullable = false , length=100)
    private String url;

    private Date age;

    @Column(unique = true , nullable = false , length = 100)
    private String email;

    @Column(length = 100)
    private String phno;
}
