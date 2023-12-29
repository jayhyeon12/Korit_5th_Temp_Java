package com.study.ch04;

public class Quiz01 {
    public static void main(String[] args) {
        /*
        x, y 중 하나라도 값이 0이면 결과는 "오류"
        제1사분면: x > 0, y > 0
        제2사분면: x < 0, y > 0
        제3사분면: x < 0, y < 0
        제4사분면: x > 0, y > 0
        */

        int x = 0;
        int y = 0;

        String result1 = x == 0 || y == 0 ? "오류"
                : x > 0 ? (y > 0 ? "제1사분면":"제4사분면")
                : (y > 0 ? "제2사분면":"제3사분면");

        String result2 = x == 0 || y == 0 ? "오류"
            : x > 0 && y > 0 ? "제1사분면"
                : x < 0 && y > 0 ? "제2사분면"
                : x < 0 && y < 0 ? "제3사분면"
                : x > 0 && y < 0 ? "제4사분면" : "오류";

    }

}