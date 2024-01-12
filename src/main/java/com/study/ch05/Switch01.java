package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        /* switch 문: 입력 자료형과 스위치 자료형이 같아야 함

        default: 모든 케이스에 해당하지 않을 때 출력
        */

        System.out.println("번호 선택: ");
        num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("오류");
        }
    }
}