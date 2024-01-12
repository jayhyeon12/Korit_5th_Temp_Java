package com.study.ch07.register;

public class ProductService {

    boolean isEmptyString(String str) {
        if(str == null){
            return true;
        }
        return str.isBlank();
    }

    void registerProductService(Product p) {
        ProductRepository pr = new ProductRepository();

        System.out.println("서비스까지 데이터 전달");

        pr.saveProduct(p);
    }

}