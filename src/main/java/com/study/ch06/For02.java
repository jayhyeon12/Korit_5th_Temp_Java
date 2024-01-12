package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        출력 결과: 0, 1, 2, 3, 4
                  5, 6, 7, 8, 9
         */

        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            }

            System.out.println();

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            }
            if (i % 5 == 4)
                System.out.println();
        }
    }
}

