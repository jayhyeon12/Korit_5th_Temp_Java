package com.study.ch07.information;

public class InformationRoom {
    void checkInformation (Information i) {
        InformationDB ib = new InformationDB();
        ib.insertInformation(i);

        InformationRoom ir = new InformationRoom();

    }
}
