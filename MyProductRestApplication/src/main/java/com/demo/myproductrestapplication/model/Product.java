package com.demo.myproductrestapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "myproduct11")
public class Product {
    @Id
    private int pid,qty, cid;
    private String pname ;
    private double price;
    private LocalDate expdata;



    public Product(int pid, String pname, int qty, double price, LocalDate ldt, int cid) {
        this.pid = pid;
        this.qty = qty;
        this.cid = cid;
        this.pname = pname;
        this.price = price;
        this.expdata = ldt;

    }

    public Product() {
        pid=0;
        qty=0;
        cid=0;
        pname="";
        price=0;
        expdata=null;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExpdata() {
        return expdata;
    }

    public void setExpdata(LocalDate expdata) {
        this.expdata = expdata;
    }


    @Override
    public String toString() {
        String str= expdata.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return "Product{" +
                "pid=" + pid +
                ", qty=" + qty +
                ", cid=" + cid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", Date=" + str+" }";
    }
}