package com.demo.myproductrestapplication.dao;

import com.demo.myproductrestapplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{


    @Query(value = "select * from myproduct11 where price between :lpr and :hpr", nativeQuery = true)
    List<Product> findByPrice(double lpr, double hpr);
}
