package com.study.ch07.register;

public class ProductDB {

    void insertProduct(Product p) {
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용 ");
        System.out.println("name: " + p.name);
        System.out.println("code: " + p.code);
        System.out.println("price: " + p.price);
    }

}