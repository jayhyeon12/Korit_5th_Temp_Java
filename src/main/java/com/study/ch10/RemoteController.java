package com.study.ch10;

public class RemoteController extends ElectronicDevice {

    @Override
    void showDeviceState() {
        System.out.println("리모컨 전원 확인합니다");
    }
}