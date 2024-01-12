package com.study.ch06;

import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별의 개수는?");
        int starCount = sc.nextInt();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i++) {
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i < 6; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}