package com.study.ch19;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Student {
    private String name;
    private String adr;
    private int age;

    public Student(String name, String adr, int age) {
        this.name = name;
        this.adr = adr;
        this.age = age;

    }

    public static StudentBuilder builder()  {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String adr;
        private int age;

        public Student build() {
            return new Student(name, adr, age);
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder adr(String adr) {
            this.adr = adr;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

    }

}