package com.demo.myproductrestapplication.service;

import com.demo.myproductrestapplication.dao.CategoryDao;
import com.demo.myproductrestapplication.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> getAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category getById(int id) {
        Optional<Category> oc = categoryDao.findById(id);
        if (oc.isPresent()) {
            return oc.get();
        }
        return null;

    }

    @Override
    public boolean save(Category c) {
        Category cr = categoryDao.save(c);
        return cr != null;
    }

    @Override
    public boolean delete(int id) {
        categoryDao.deleteById(id);
        return true;
    }

    @Override
    public boolean updateCategory(Category c) {
        Optional<Category> oc = categoryDao.findById(c.getCId());
        if (oc.isPresent()) {
            Category cr = oc.get();
            cr.setCname(c.getCname());
            cr.setCdesc(c.getCdesc());
            categoryDao.save(cr);
            return true;
        }
        return false;
    }
}