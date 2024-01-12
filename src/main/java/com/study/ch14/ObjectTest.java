package com.study.ch14;

/* object 클래스


* 자바의 모든 클래스는 object 클래스를 상속 받음
*/

import java.util.Objects;

public class ObjectTest { // (extends object)
    private String name;
    private String adr;


    public ObjectTest(String name, String adr) {
        this.name = name;
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", adr='" + adr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 주소 비교
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o; //
        return Objects.equals(name, that.name) && Objects.equals(adr, that.adr);
        // objects: 클래스가 모인 도구 / equals: static 메소드 / 주소가 달라도 내부 값이 같으면 true
    }

    @Override
    public int hashCode() { // 주소 값 비교
        return Objects.hash(name, adr);
    }

}