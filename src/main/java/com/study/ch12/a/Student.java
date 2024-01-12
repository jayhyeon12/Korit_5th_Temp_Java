package com.study.ch12.a;

public class Student {
    private String name;
    private String adr;

    public Student() {

    }

    public Student(String name, String adr) {
        this.name = name;
        this.adr = adr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public String setAdr(String adr) {
        return adr;
    }

    public String getAdr(String adr) {
        return adr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adr='" + adr + '\'' +
                '}';
    }

    public void test() {
        System.out.println(add(10, 20));
        System.out.println(add(4, 32));
        System.out.println(add(6, 9));
    }

    private int add(int a, int b){
        return a + b;
    }
}
