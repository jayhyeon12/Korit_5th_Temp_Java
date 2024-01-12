package com.study.ch07.information;

public class InformationDB {
        void insertInformation(Information i) {
            System.out.println("저장된 개인정보 열람 목록에서 정보를 확인합니다");
            System.out.println("정보는 다음과 같습니다");

            System.out.println("name: " + i.name);
            System.out.println("age: " + i.age);
            System.out.println("adr: " + i.adr);
            System.out.println("lockerNum: " + i.lockerNum);

    }

}
