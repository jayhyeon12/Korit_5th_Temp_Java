package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactoryService1 fs1 = new FactoryService1();
        FactoryService2 fs2 = new FactoryService2(sc);

        fs1.create();
        fs2.create();

    }

}