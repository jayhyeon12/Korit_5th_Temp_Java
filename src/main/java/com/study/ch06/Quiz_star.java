package com.study.ch06;

import java.util.Scanner;

public class Quiz_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별이 몇 개 입니까?");
        int starCount = sc.nextInt();

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        ***
        **
        *

          *
         **
        ***

        ***
         **
          *

          *
         ***
        *****

        */

    }
}