package com.study.ch08;

public class PhoneArray {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("samsung", "galaxy");
        phones[1] = new Phone("apple", "iphone");
        phones[2] = new Phone("nokia", "a1342");

        for(int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}
