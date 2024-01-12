package com.study.ch08.member;

public class Member {
    String code;
    String name;
    int age;
    String adr;

    Member(String code, String name, int age, String adr){
        this.code = code;
        this.name = name;
        this.age = age;
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "com.study.ch08.Member{" +
                "code = '" + code + '\'' +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", adr = '" + adr + '\'' +
                '}';
    }
}