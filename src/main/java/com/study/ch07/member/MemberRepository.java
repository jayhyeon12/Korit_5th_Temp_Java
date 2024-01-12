package com.study.ch07.member;

public class MemberRepository {

    int insert(Member m) {
        System.out.println("저장소에 Member 저장");
        System.out.println(m.toString());
        return 1;

    }
}
