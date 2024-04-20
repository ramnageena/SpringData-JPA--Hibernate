package com.jpa.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "products_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     @Column(name = "stock_keeping_unit")
     private String sku; //stock keeping unit
     @Column(nullable = false)
     private String name;
     private  String description;
     private boolean active;
     private String imageUrl;
     private BigDecimal price;
     private LocalDateTime dateCreated;
     private LocalDateTime lastUpdated;
}
