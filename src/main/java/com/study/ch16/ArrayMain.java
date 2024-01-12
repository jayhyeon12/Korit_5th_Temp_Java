package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService as = new ArrayService(initStrArray);
        as.add("000");

        as.add("998");
        as.add("238");
        as.add("568");
        as.add("880");
        as.add("52328");
        as.add("48");
        as.add("28");
        as.add("568");

        System.out.println(as.toString());
        System.out.println(as.indexOf("박00"));

    }
}