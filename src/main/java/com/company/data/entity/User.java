package com.company.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
    @Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "last_name")
        private String last_name;

        @Column(name = "email")
        private String email;

        @Column(name = "password")
        private String password;

    }
