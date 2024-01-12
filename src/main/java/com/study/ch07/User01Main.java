package com.study.ch07;

public class User01Main {
    public static void main(String[] args) {
        User01 u01 = new User01("asg", "5322");
        User01 u02 = new User01("hyt", "6543", "000", "fsdjkl@gmail.com");

        u01.showInfo();
        System.out.println("--------------");

        u02.showInfo();
        System.out.println("--------------");

        u01.setName("asg");
        u01.setEmail("fsdjkl@gmail.com");

        u01.showInfo();


    }
}