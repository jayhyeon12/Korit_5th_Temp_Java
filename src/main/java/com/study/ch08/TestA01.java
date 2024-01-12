package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];

        TestB01 bclass = new TestB01();
        bclass.add(nums, num, num2);
        bclass.showArrayData(nums);

        bclass.add(nums, 10, 40);
        bclass.showArrayData(nums);

    }

}
