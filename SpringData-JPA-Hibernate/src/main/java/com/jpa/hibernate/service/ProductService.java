package com.jpa.hibernate.service;

import com.jpa.hibernate.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getProducts();
    Product getProductById(Long id);
    Product updateProduct(Product product,Long id);
    void delete(Long id);

}
