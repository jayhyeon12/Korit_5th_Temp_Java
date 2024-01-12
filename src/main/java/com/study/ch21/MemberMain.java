package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args) {

        ArrayList<Member> ms = new ArrayList<>();

        ms.add(Member.builder().name("김종현").build());
        ms.add(Member.builder().name("이00").build());
        ms.add(Member.builder().name("박00").build());
        ms.add(Member.builder().name("정00").build());

        MemberService mS =  new MemberServiceImpl();
        try {
            mS.printMemberList(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }

}