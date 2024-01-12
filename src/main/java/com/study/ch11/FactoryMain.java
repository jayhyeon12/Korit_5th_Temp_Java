package com.study.ch11;

public class FactoryMain {
    public static void main(String[] args) {
        Company c = new Company();
        c.setName("JYU");

        Phone p1 = new Phone(c);
        Phone p2 = new Phone(c);
        Phone p3 = new Phone(c);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}