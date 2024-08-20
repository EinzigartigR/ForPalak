package com.demo.myproductrestapplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mycategory11")
public class Category{
    @Id
    private int cid ;
    private String cname, cdesc;

    public Category(int cid, String cname, String cdesc) {
        this.cid=cid;
        this.cname=cname;
        this.cdesc=cdesc;
    }
    public Category() {}

    public int getCId() {
        return cid;
    }

    public void setId(int id) {
        this.cid = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc =cdesc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + cid +
                ", cname='" + cname + '\'' +
                ", cdesc='" + cdesc + '\'' +
                '}';
    }
}