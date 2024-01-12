package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectTest ot = new ObjectTest("이", "남구");

        System.out.println(ot.toString());
        System.out.println(ot); // 자동으로 toString 호출

        ObjectTest ot1 = new ObjectTest("이", "남구");
        System.out.println(ot.equals(ot1)); // System.out.println(ot == ot1);

        System.out.println(ot.equals(ot1));
        System.out.println(ot == ot1);

        System.out.println(ot.getClass());
        System.out.println(ot1.getClass());
        System.out.println(ObjectTest.class); // static으로 접근

        // 인스턴스의 값만을 hashcode로 비교
        System.out.println(ot.hashCode());
        System.out.println(ot1.hashCode());


    }

}
