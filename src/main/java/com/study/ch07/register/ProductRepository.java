package com.study.ch07.register;

public class ProductRepository {

    void saveProduct(Product p) {
        ProductDB pd = new ProductDB();
        pd.insertProduct(p);

        ProductRepository pr = new ProductRepository();


    }


}