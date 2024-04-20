package com.jpa.hibernate.service.impl;

import com.jpa.hibernate.entity.Product;
import com.jpa.hibernate.repository.ProductRepository;
import com.jpa.hibernate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);

    }

    @Override
    public List<Product> getProducts() {
       return productRepository.findAll();

    }

    @Override
    public Product getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product is not found :" + id));
        return product;
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
