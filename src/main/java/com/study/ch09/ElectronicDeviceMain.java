package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice[] ed = new ElectronicDevice[10];

        for (int i = 0; i < ed.length; i++) {
            ed[i] = i % 2 == 0? new Computer() : new SmartPhone();
        }

        for (int i = 0; i < ed.length; i++) {
            ed[i].showDeviceState();
        }

        System.out.println();

        for (int i = 0; i < ed.length; i++) {
            ed[i].setPowerOn();
        }

        System.out.println();

        for (int i = 0; i < ed.length; i++) {
            ed[i].showDeviceState();
        }

        for (int i = 0; i < ed.length; i++) {
            if (ed[i] instanceof Computer) {
                Computer c = (Computer) ed[i];
                c.playGame();
            } else if (ed[i] instanceof SmartPhone) {
                SmartPhone sp = (SmartPhone) ed[i];
                sp.call();
            }
        }

    }
}