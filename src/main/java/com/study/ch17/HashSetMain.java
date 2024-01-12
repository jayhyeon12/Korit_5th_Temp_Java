package com.study.ch17;

/* set: 순서가 없어 get(), set(), indexOf() 사용 불가

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("000");
        nameList.add("001");
        nameList.add("002");
        nameList.add("003");

        System.out.println(nameList);

        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);

        String findName = null;

        //get() 사용 불가이므로 for each 사용
        for (String name : names) {
            if (name.equals("004")) {
                findName = name;
                break;
            }
        }

        System.out.println(Objects.hash("000"));
        System.out.println(Objects.hash("002"));
        System.out.println(Objects.hash("003"));
        System.out.println(Objects.hash("001"));

    }
}