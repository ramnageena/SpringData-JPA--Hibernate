package com.jpa.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "product_db")
public class Product {
    @Id
    private Long id;
    private String sku; //stock keeping unit
    private String name;
     private  String description;
     private boolean active;
     private String imageUrl;
     private BigDecimal price;
     private LocalDateTime dateCreated;
     private LocalDateTime lastUpdated;
}
