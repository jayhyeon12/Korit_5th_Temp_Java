package com.study.ch13;

public class C2 {

    public void c2(Company c) {
        System.out.println(" C2 클래스 ");
        System.out.println(c);
        System.out.println(" C2 클래스 싱글톤 결과 ");
        System.out.println(Company.getInstance());

    }

}