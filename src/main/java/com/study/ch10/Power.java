package com.study.ch10;

/*
인터페이스: 기본적으로 모든 메소드가 추상 메소드로 정의됨
           일반 메소드 생성 시 default 키워드 작성
           변수 선언 불가하나 초기화하면서 생성해야 함(static 상수)
           다중 상속이 가능하며 인터페이스 간 상속도 가능
           기능을 묶어 놓은것

재정의: 상속 받은 클래스에서 메소드를 명확하게 다시 구체화함
*/

public interface Power {
    String ERROR_CODE = "~6879";

    void setPowerOn();
    void setPowerOff();

    default void test() {

    }


}