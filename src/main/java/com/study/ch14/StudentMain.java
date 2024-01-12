package com.study.ch14;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("000", "01000000000", "000", 20);
        System.out.println(s);

        Student2 s2 = new Student2("ㄱㅂㅈ", "01011112222");
        s.setPhone("01048375436");

    }
}
