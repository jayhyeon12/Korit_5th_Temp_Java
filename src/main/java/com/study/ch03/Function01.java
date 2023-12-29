package com.study.ch03;

public class Function01 {
    public static void main(String[] args) {
        System.out.println(1 + 2 * 3 / 2 * 3);

        /*

         */
        fx1(2, 3, 56, 78, 54); // 함수 호출
        fx2("Mr_kim");

        }
        // 함수 정의
        static int fx1(int a, int b, int c, int d, int e) {
        return a + b * c - d * e;
        }

        static void fx2(String name)  {
            System.out.println("이름은 " + name + "입니다");

    }
        static void fx3(){
            System.out.println(1 + 3 * 4 / 4 * 5);
            System.out.println(1 + 4 * 4 / 4 * 6);
            System.out.println(1 + 3 * 5 / 9 * 7);
            System.out.println(1 + 6 * 3 / 8 * 8);
            System.out.println(1 + 7 * 2 / 7 * 10);
        }

}