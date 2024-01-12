package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            System.out.print("입력: ");
            int inputValue = sc.nextInt();

            System.out.println("입력한 번호: " + inputValue);
            if(inputValue == 0) {
                System.out.println("프로그램 종료");
                flag = false;
            } else if (inputValue == 1) {
                System.out.println("1번으로 들어 왔습니다");
                boolean flag2 = true;
                while(flag2) {
                    System.out.print("1번에서 입력: ");
                    inputValue = sc.nextInt();

                    System.out.println("입력한 번호: " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램 종료");
                        flag = false;
                        break;
                    } else if (inputValue == -1) {
                        System.out.println("뒤로 가기");
                        break;
                    } else if (inputValue == 1) {
                        System.out.println("1번에서 1번으로 들어 왔습니다");
                    } else if (inputValue == 2) {
                        System.out.println("2번에서 2번으로 들어 왔습니다");
                    } else {
                        System.out.println("재입력");
                    }
                    System.out.println();
                }
            } else if (inputValue == 2) {
                System.out.println("2번으로 들어 왔습니다");
            } else {
                System.out.println("재입력");
            }
            System.out.println();

        }

    }
}