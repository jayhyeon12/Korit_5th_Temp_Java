package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor

/* generic: 클래스명 뒤에 <문자/자료형>를 작성하여 클래스의 멤버변수를 원하는 타입으로 변경
타입의 수는 원하는 만큼 가능하며 일반 자료형은 작성 불가(클래스 자료형만 작성 가능)

매개변수 전달 시 어떤 자료형인지 모르거나 자료형이 다를 때 <?>로 작성 → 와일드 카드

와일드카드 제한
-
*/

public class SendData <T> {
    private int code;
    private T data;

    public void send() {
        System.out.println("[Data 전송]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);

    }

}