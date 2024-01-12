package com.study.ch11;

public class Phone {
    static int autoCount = 0;
    int serialNumber;
    Company company;

    public Phone(int serialNumber, Company c) {
        autoCount++;
        this.serialNumber = 20246549;
        this.serialNumber += autoCount;
        this.company = c;

    }

    public Phone(Company c) {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }

}
