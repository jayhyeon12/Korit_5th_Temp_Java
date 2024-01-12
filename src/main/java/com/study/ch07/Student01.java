package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String adr;
    final String adr;

    /*
    args(arguments): 매개변수
    No args constructor(매개변수가 없는 생성자)
    */
//    Student01() {
//        adr = " ";
//    }

    // All args constructor
    Student01(String name, int age, String adr) {
      this.name = name;
      this.age = age;
      this.adr = adr;

    }
    // Required args constructor: 필수 생성자
    Student01(String adr){
        this.adr = adr;
    }

}
