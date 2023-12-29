package com.study.ch04;

public class Operation03 {
    public static void main(String[] args) {
       /*
       연도가 주어질 때, 윤년이면 1, 아니면 0을 출력하는 프로그램 작성

       윤년: 년도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때인 경우

       ex) 2012년 = 4의 배수이지만 100의 배수가 아님 → 윤년
       1900년 = 100의 배수이고 400의 배수는 아니라서 윤년이 아님
       2000년 = 400의 배수이기 때문에 윤년

       연도는 0보다 크며, 4001보다 작은 자연수
       */

        int year = 1;

        boolean step1 = year > 0;
        boolean step2 = year < 4001;
        boolean step3 = year % 4 == 0;
        boolean step4 = year % 100 != 0;
        boolean step5 = year % 400 == 0;

        boolean result = step1 && step2 && (step3 && step4 || step5);


    }
}