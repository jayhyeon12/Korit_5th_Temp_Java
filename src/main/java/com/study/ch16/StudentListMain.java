package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("최00", 16));
        s.add(new Student("윤00", 16));
        s.add(new Student("장00", 16));
        s.add(new Student("한00", 16));

        System.out.println(s);

        // 학생들 나이를 1씩 더해서 출력
        for (int i = 0; i < s.size(); i++) {
            Student student = s.get(i);
            s.get(i).setAge(s.get(i).getAge() + 1);

        }
        // ↓
        // 향상된 for
        for (Student student : s) {
            student.setAge(student.getAge() + 1);

        }
        System.out.println(s);

        Student[] sa = new Student[4];
        for (int i = 0; i < sa.length; i++) {
            Student student;
            student = new Student("000", 17);
            sa[i] = new Student("000", 17);
        }
        // ↓
        int i = 0;
        for (Student student : sa)
            sa[i] = new Student("000", 17);
        i++;
    }

}