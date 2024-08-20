package com.demo.myproductrestapplication.service;

import com.demo.myproductrestapplication.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category getById(int id);

    boolean save(Category p);

    boolean delete(int id);

    boolean updateCategory(Category p);
}
