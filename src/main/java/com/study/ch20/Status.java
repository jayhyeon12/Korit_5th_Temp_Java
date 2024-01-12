package com.study.ch20;

/*
열거형: 인스턴스의 경우를 정해 놓고 키워드로 호출하는 방식

*/

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    OK(340, "정상적 요청"),
    BADREQUEST(341, "비정상적 요청");

    private int code;
    private String statusName;

}