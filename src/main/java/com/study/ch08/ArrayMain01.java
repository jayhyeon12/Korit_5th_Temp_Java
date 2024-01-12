package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {
        /* 배열(array):
        특징 - 선언 시 힙 메모리에 동적 할당됨.
        기본 구조 - 자료형[] 배열명(또는 자료형 배열명[]) = new 자료형[배열 길이]; = { };
        */

        int num1 = 10;
        int num2 = 20;

        int[] numArray; // 배열 선언
        numArray = new int[3]; // 값 대입

        System.out.println(numArray); // 배열의 주소

        numArray[0] = 10;
        System.out.println(numArray[0]);

        numArray[1] = 20;
        numArray[2] = 30;

        Scanner sc = new Scanner(System.in);
        System.out.println("index: ");
        int index = sc.nextInt();

        System.out.println(numArray[index]);

    }

}