package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229;
        System.out.println(20231229);
        /* int date; - 변수  선언
        int date = 10; - 대입(할당)

        자료형 변환 시
        upcasting: 자료형을 하위 개념에서 상위 개념으로 변환
        downcasting: 자료형을 상위 개념에서 하위 개념으로 변환

        문자 → 정수 → 실수

         */

        char a ='1';
        int b = a;
        double c = (double) b;
    }
}
