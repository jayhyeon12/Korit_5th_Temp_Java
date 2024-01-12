package com.study.ch11;

// static 키워드 사용 시 스택 메모리에 할당
// 다른 객체를 생성해도 메모리 공간은 복사되지 않음

public class JYUCompany {
    static String name = "JYU";

    static void showCompanyInfo() {
        System.out.println("회사명: " + name);
    }
}