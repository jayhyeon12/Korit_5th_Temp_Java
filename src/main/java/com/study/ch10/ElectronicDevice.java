package com.study.ch10;

/* 추상화
1. 추상 클래스(abstract)
2. 인터페이스(interface)

클래스 간 상속은 extend, 클래스와 인터페이스 간 상속은 implement

*/

public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff(){
        powerState = false;
    }

    // 추상 메소드: 추상 클래스와 인터페이스에서만 정의 가능
    abstract void showDeviceState();

}