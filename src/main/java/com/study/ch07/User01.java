package com.study.ch07;

public class User01 {
    // 아이디(필수), 비밀번호(필수), 이름, 메일,
    // 메소드 - setName(String name), setEmail(String email), showInfo()
    final String username;
    final String ps;
    String name;
    String email;

    User01(String username, String ps, String name, String email) {
        this.username = username;
        this.ps = ps;
        this.name = name;
        this.email = email;

    }

    User01(String username, String ps) {
        this.username = username;
        this.ps = ps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void showInfo() {
        System.out.println("username: " + username);
        System.out.println("ps: " + ps);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
    }

}