package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "김00";
        names[1] = "박00";
        names[2] = "유00";
        names[3] = "장00";

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

    }
}