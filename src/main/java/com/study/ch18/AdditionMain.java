package com.study.ch18;

/*

*/

public class AdditionMain {
    public static void main(String[] args) {
        // 익명 클래스 생성
        Addition a1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        Addition a2 = new AdditionImpl();

        System.out.println(a1.add(20, 40));
        System.out.println(a2.add(34, 60));

        Addition a3 = (int x, int y) -> { // ->: add 함수명
            //System.out.println("람다식으로 구현한 add 메소드");
            return x + y;
        };

        System.out.println(a3.add(57, 76));

        //1. 람다식의 매개변수 자료형은 생략 가능
        Addition a4 = (x, y) -> {
          return x + y;
        };

        /* 2. 함수의 실행문이 한 줄이면 중괄호 생략 가능
        단, return은 중괄호 생략 시 같이 생략
        */
        Addition a5 = (x, y) -> x + y;
        Viewer viewer = viewData -> {
            System.out.println("화면 출력");
        };
        Viewer viewer1 = (viewData) -> System.out.println("화면 출력");

        /* 3. 매개변수가 1개일 경우 매개변수 괄호 생략 가능 */
        Viewer viewer2 = viewData -> System.out.println("화면 출력");

         /*
         람다식 핵심 조건: 인터페이스 내에 딱 하나의 추상메소드가 정의되어야 함
         단, 일반 메소드는 여러 개 정의되어도 상관 없음
         재정의 시 변수명도 변경 가능
         */



    }
}