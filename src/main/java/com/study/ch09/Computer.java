package com.study.ch09;

public class Computer extends ElectronicDevice {
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다");
    }
    // 재정의: 부모클래스의 메소드와 동일한 형태로 실행문만 다시 정의 가능
    void showDeviceState() {
        System.out.print("컴퓨터 ");
        super.showDeviceState();
    }

}
