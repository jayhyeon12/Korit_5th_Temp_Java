package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.println("결과: ");
        sc.nextLine();
        String rs = sc.nextLine();
        // sc.nextLine(); 문자열에서 띄어쓰기를 포함하여 입력 받음

        System.out.println("결과: " + (a + b + c));

    }
}