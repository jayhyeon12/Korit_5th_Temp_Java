package com.study.ch15;

public class VIPMember extends Member {
    private final String code = "VIP";

    public VIPMember(String name, String phone) { // 부모 클래스의 생성자 호출
        super(name, phone);

    }

}