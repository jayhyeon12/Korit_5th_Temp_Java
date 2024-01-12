package com.study.ch07.member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService ms = new MemberService();

        String selectedMenu = null;


        while (true) {
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택>>");
            selectedMenu = sc.nextLine();

            if("1".equals(selectedMenu)) {
               boolean responseData = ms.addMember();
               if(responseData) {
                   System.out.println("-- 회원 등록 완료 --");
               } else {
                   System.out.println("-- 회원 등록 취소 --");
               }

            } else if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else {
                System.out.println("다시 선택");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("<< 프로그램 종료 >>");
    }

}