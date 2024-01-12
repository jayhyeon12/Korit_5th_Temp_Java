package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        //익명클래스: 이름이 없는 클래스로 메소드만 정의되는 일회성 클래스
        ElectronicDevice ed = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 전원 확인");
        }
    };
        ElectronicDevice ed2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 전원 확인");
        }
    };

        RemoteController rc = new RemoteController();

        ElectronicDevice[] eds = new ElectronicDevice[3];
        eds[0] = ed;
        eds[1] = ed2;
        eds[2] = rc;

        for (int i = 0; i < eds.length; i++) {
            eds[i].showDeviceState();

        }

    }

}