package com.study.ch07.information;

import java.util.Scanner;

public class InformationMain {
    public static void main(String[] args) {
        InformationRoom ir  = new InformationRoom();

        Scanner sc = new Scanner(System.in);

        String name = null;
        String adr = null;
        int age = 0;
        int lockNum = 0;

        System.out.println("개인정보를 확인합니다");

        System.out.println("성함: ");
        name = sc.next();
        if(ir.equals(name)) {
            System.out.println("다음 항목 진행");
        } else {
            System.out.println("이름 다시 확인");
        }

        System.out.println("나이: ");
        age = sc.nextInt();
        if(ir.equals(age)) {
            System.out.println("다음 항목 진행");
        } else {
            System.out.println("나이 다시 확인");
        }

        System.out.println("주소: ");
        adr = sc.nextLine();
        if(ir.equals(adr)) {
            System.out.println("다음 항목 진행");
        } else {
            System.out.println("주소 다시 확인");
        }

        System.out.println("사물함 번호: ");
        lockNum = sc.nextInt();
        if(ir.equals(lockNum)) {
            System.out.println("조회 시작");
        } else {
            System.out.println("사물함 번호 다시 확인");
        }

        Information i = new Information(name, age, adr, lockNum);

    }
}