package com.study.ch03;

public class Function02 {

    // 1. 매개변수, 리턴값 둘 다 없는 경우
    public static void fx01() {
        // void: 빈, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    // 2. 매개변수는 있는데 리턴값이 없는 경우
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

     /*오버로딩: 함수(메소드) 이름이 같지만 매개변수 자료형이 다르면 새로운 함수(메소드)로 정의 가능
     리턴 값은 오버로딩에 영향을 주지 않으며 함수명과 매개변수에만 영향 받음 */
    public static void fx02(String name, int age) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();
    }

    // 3. 매개변수는 없지만 리턴값이 있는 경우
    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }

    // 4. 매개변수, 리턴값 둘 다 있는 경우
    public static String fx04(String name, int age){
        return name + ", " + age;

    }

    public static void main(String[] args) {
        fx01();
        fx02(23, "박씨");
        fx02("정00", 27);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("이0", 29);
        System.out.println(result);
    }
}