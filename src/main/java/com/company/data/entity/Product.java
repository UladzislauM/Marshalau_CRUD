package com.company.data.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
    @Entity
    @Table(name = "product")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "created_at")
        private LocalDate created_at;

        @Column(name = "product_status")
        @Enumerated(EnumType.STRING)
        private Status product_status;

        @Column(name = "price")
        private BigDecimal price;


}
