package com.study.ch07.member;

import java.util.Scanner;

public class MemberService {
    String inputValue(String label) {
        Scanner sc = new Scanner(System.in);
        String value = null;
        while (true) {
            System.out.println(label + "(입력 취소: exit) >> ");
            value = sc.nextLine();
            if (!value.isBlank()) {
                break;
            }
        }
        return value;
    }


    boolean addMember() {
        String code = null;
        String name = null;
        String age = null;
        String adr = null;

        System.out.println("<< 회원 등록 >>");
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("회원 이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("회원 나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        adr = inputValue("회원 주소");
        if("exit".equalsIgnoreCase(adr)) {
            return false;
        }

        Member m = new Member(code, name, Integer.parseInt(age), adr);
        MemberRepository mr = new MemberRepository();
        return mr.insert(m) > 0;

    }
}