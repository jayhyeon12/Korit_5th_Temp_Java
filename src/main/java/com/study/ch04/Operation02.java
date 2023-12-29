package com.study.ch04;

public class Operation02 {
    public static void main(String[] args) {
        /*
        비교연산자: <, >, >=, <=
         */

        System.out.println(true);
        System.out.println(false);

        boolean flag = 10 > 2;

        System.out.println(" > " + flag);

        System.out.println();

        /*
        논리연산자: &&(곱/ and), ||(합/or), !(부정/ not)
        true && false → false
        true && true → true
        true || false → true
        true || true → true
        !false → true

         */

        System.out.println(745 % 5 == 0 && 745 % 7 != 0);
        System.out.println(850 % 4 == 0 || 850 % 15 == 0);

        int y = 26;
        System.out.println(y < 30 && y > 24 && y!= 30);

    }
}