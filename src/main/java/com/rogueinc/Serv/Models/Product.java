package com.rogueinc.Serv.Models;

import jakarta.persistence.*;

@Entity
public record Product(
        String name,
        Double price,
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        Long id
) {
        public Product(String name, Double price) {
                this(name, price, null);
        }
}