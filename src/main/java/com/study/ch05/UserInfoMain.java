package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        이름: Nickson
        나이: 25
        연락처: 328 5765 674
        학년: 3
        주소: State of Arizona, America
        */
        Scanner sc = new Scanner(System.in);
        String name = null;
        int age = 0;
        String pn = null;
        int grade = 0;
        String add = null;

        System.out.print("이름: ");
        name = sc.next();
        System.out.print("나이: ");
        age = sc.nextInt();
        System.out.print("연락처: ");
        sc.nextLine();
        pn = sc.nextLine();
        System.out.print("학년: ");
        grade = sc.nextInt();
        sc.nextLine();
        System.out.print("주소: ");
        add = sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + pn);
        System.out.println("학년: " + grade);
        System.out.println("주소: " + add);

    }
}