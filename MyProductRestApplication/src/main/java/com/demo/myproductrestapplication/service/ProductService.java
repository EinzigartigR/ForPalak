package com.demo.myproductrestapplication.service;

import com.demo.myproductrestapplication.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product getById(int id);

    boolean save(Product p);

    boolean delete(int id);

    boolean updateProduct(Product p);

    List<Product> getByPrice(double lpr, double hpr);
}
