package com.demo.myproductrestapplication.controller;

import com.demo.myproductrestapplication.model.Category;
import com.demo.myproductrestapplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> clist = categoryService.getAll();
        return ResponseEntity.ok(clist);
    }

    @GetMapping("/category/{cid}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("cid") int id) {
        Category c = categoryService.getById(id);
        if(c!=null) {
            return ResponseEntity.ok(c);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/category/{cid}")
    public ResponseEntity<String> deleteCategory(@PathVariable("cid") int id) {
        boolean s = categoryService.delete(id);
        if(s) {
            return ResponseEntity.ok("data deleted successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/category/{cid}")
    public ResponseEntity<String> updateCategory(@RequestBody Category c) {
        boolean s = categoryService.updateCategory(c);
        if(s) {
            return ResponseEntity.ok("data updates successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/category/{cid}")
    public ResponseEntity<String> createCategory(@RequestBody Category c) {
        boolean s = categoryService.save(c);
        if(s) {
            return ResponseEntity.ok("data inserted successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}
