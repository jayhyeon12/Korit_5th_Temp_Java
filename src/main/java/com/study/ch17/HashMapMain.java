package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("username", "knight");
        map.put("ps", "******");
        map.put("name", "신00");
        map.put("email", "&&&&@gmail.com");

        System.out.println(map);
        System.out.println(map.get("email"));

    }
}
