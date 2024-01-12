package com.study.ch08.member;

public class MemberRepository {

    Member[] members = new Member[3];

    int insert(Member[] members, Member m) {
        for(int i = 0; i < members.length; i++) {
            if(members[i] == null); {
                members[i] = m;
                break;
            }
        }
        System.out.println("저장소에 Member 저장");
        System.out.println(m.toString());
        return 1;

    }
}