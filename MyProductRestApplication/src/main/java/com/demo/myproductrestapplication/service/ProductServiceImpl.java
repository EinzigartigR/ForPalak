package com.demo.myproductrestapplication.service;

import com.demo.myproductrestapplication.dao.ProductDao;
import com.demo.myproductrestapplication.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @Override
    public Product getById(int id) {
        Optional<Product> op= productDao.findById(id);
        if(op.isPresent()){
            return op.get();
        }
            return null;

    }

    @Override
    public boolean save(Product p) {
        Product pr = productDao.save(p);
        return pr != null;
    }

    @Override
    public boolean delete(int id) {
        productDao.deleteById(id);
        return true;
    }

    @Override
    public boolean updateProduct(Product p) {
        Optional<Product> op= productDao.findById(p.getPid());
        if(op.isPresent()){
            Product pr = op.get();
            pr.setPname(p.getPname());
            pr.setQty(p.getQty());
            pr.setPrice(p.getPrice());
            pr.setExpdata(p.getExpdata());
            pr.setCid(p.getCid());
            productDao.save(pr);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> getByPrice(double lpr, double hpr) {
        return productDao.findByPrice(lpr,hpr);
    }
}
