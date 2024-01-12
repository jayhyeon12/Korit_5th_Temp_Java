package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data

public class Student {
    private final String name;
    private String adr;

    private String Phone;
    private int age;

}