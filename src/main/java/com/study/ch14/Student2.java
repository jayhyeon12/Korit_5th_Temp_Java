package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@NonNull

public class Student2 {
    private final String name;
    private String adr;
    @NonNull
    private final String phone;
}
