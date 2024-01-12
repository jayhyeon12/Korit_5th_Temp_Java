package com.study.ch09;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call(){
        System.out.println("통화를 시도합니다");
    }

    @Override // @: 어노테이션
    void showDeviceState() {
        super.showDeviceState();
    }
}
