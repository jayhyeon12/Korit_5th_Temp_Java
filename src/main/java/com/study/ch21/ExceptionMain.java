package com.study.ch21;

/* 예외
1. 컴파일 실행 전

2. 컴파일 실행 후

*/

public class ExceptionMain {
    public static void main(String[] args) {

        int[] nA = new int[] {1, 2, 3, 4, 5};
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(nA[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외 발생");
            }

        }

        System.out.println("프로그램 종료");

    }

}