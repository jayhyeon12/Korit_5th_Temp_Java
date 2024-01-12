package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        /*
        for 문(반복 횟수 중심): 일정 횟수를 증가시키며 반복할 때
        for(초기값, 조건식, 증감식) { 실행문... }
        실행 순서: 초기값(최초 한 번) - 조건식 - {} - 증감식

        while 문(조건 중심)
        */
        for(int i = 0; i < 10; i++) {
            System.out.println("i: " + i);

        }
    }
}