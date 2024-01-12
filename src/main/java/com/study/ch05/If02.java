package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        System.out.println("(x, y) 좌표 입력>> ");

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("(x, y)는 제1사분면에 속합니다");
        } else if (x < 0 && y > 0) {
            System.out.println("(x, y)는 제2사분면에 속합니다");
        } else if (x < 0 && y < 0) {
            System.out.println("(x, y)는 제3사분면에 속합니다");
        } else if (x > 0 && y < 0) {
            System.out.println("(x, y)는 제4사분면에 속합니다");
        } else if (x == 0) {
            System.out.println("y축 위의 점");
        } else if (y == 0) {
            System.out.println("x축 위의 점");
        } else {
            System.out.println("원점");
        }
    }
}