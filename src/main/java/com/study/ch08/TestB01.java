package com.study.ch08;

public class TestB01 {

    void add(int[] array, int x, int y){
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = x + y;
                break;
            }
        }

    }

    void showArrayData(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("배열 값 확인");
            System.out.println("index[" + i + "] → " + array[i]);
        }
    }

}