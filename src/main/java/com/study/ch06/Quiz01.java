package com.study.ch06;

public class Quiz01 {
    public static void main(String[] args) {
        /*
        출력결과: 4, 3, 2, 1, 0
        */
        int n = 5;

        for(int i = 0; i < n; i++) {
            int rv_i = n - 1 - i;
            System.out.print(rv_i);
            if(rv_i % 5 != 0) {
                System.out.print(", ");
            }
        }


    }
}
