package com.company.data.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

    @EqualsAndHashCode
    @Data
    @Entity
    @Table(name = "order_item")
    public class Order_item {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @ManyToOne
        @JoinColumn(name = "orders_id")
        private Orders orders;

        @ManyToOne
        @JoinColumn(name = "product_id")
        private Product product;

        @Column(name = "quantity")
        private Integer quantity;


}
