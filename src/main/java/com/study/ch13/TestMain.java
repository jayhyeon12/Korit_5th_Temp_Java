package com.study.ch13;

public class TestMain {
    public static void main(String[] args) {
        A a = new A();
        A2 a2 = new A2();
        Company c = Company.getInstance();

        a.a(c);
        a2.a2(c);

    }

}
