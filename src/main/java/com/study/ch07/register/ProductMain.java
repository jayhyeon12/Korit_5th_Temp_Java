package com.study.ch07.register;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        ProductService ps = new ProductService();

        Scanner sc = new Scanner(System.in);
        String productName = null;
        String productCode = null;
        long productPrice = 0;

        System.out.println("상품 등록 프로그램 입니다");

        System.out.print("상품명: ");
        productName = sc.nextLine();
        if (ps.isEmptyString(productName)) {
            System.out.println("상품명 재입력");
            return;
        }

        System.out.println("상품코드번호(P20240000)>>> ");
        productCode = sc.nextLine();
        if (ps.isEmptyString(productCode)) {
            System.out.println("상품코드 재입력");
            return;
        }
        System.out.print("가격: ");
        productPrice = sc.nextLong();

        Product p = new Product(productName, productCode, productPrice);

        ps.registerProductService(p);

    }

}