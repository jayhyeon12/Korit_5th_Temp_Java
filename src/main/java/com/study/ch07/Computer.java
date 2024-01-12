package com.study.ch07;

public class Computer {
    // field 변수, properties
    String type;
    String cpu;
    String ram;
    String disk;

    /*
    생성자(constructor): 클래스의 이름과 같으며 메소드 형태
    */
    Computer() { // 생성자 호출: 무조건 주소값을 리턴하므로 리턴 자료형 X
        type = "컴퓨터";
    }

    Computer(String type) {
        this.type = type;
    }

    void showInfo() { // 클래스의 메소드(리턴값 X)
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);

    }

}