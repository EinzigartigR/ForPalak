package com.demo.myproductrestapplication.controller;

import com.demo.myproductrestapplication.model.Product;
import com.demo.myproductrestapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        List<Product> plist = productService.getAll();
        return plist;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id){
        Product p = productService.getById(id);
       if(p != null){
           return ResponseEntity.ok(p);
       }else{
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
    }

    @GetMapping("/product/price/{lpr}/{hpr}")
    public ResponseEntity<List<Product>> getProductByPrice(@PathVariable("lpr") double lpr, @PathVariable("hpr") double hpr){
        List<Product> plist= productService.getByPrice(lpr,hpr);
        return ResponseEntity.ok(plist);
    }

    @PostMapping("/product/{id}")
    public ResponseEntity<String> createProduct(@PathVariable("id") int id, @RequestBody Product p){
        boolean s = productService.save(p);
        if(s){
            return ResponseEntity.ok("Inserted successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id){
        boolean s = productService.delete(id);
        if(s){
            return ResponseEntity.ok("Deleted Successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@RequestBody Product p){
        boolean s = productService.updateProduct(p);
        if(s){
            return ResponseEntity.ok("Updated successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
