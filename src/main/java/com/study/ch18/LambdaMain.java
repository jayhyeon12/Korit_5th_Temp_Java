package com.study.ch18;

// 기본 람다식 인터페이스

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("실행 시작");
            System.out.println("데이터 초기화");
            int a = 10;
            int b = 25;
            System.out.println("a + b = " + (a + b));
        };

        r.run();

        Supplier<Integer> num1 = () -> 10; // return, {} 생략

        int a = num1.get();

        Supplier<Scanner> sc = () -> new Scanner(System.in);
        // sc.get().nextLine();

        Consumer<String> str = name -> {
            String newName = name + "님";
            System.out.println();
        };

        str.accept("^^^");

        ArrayList<String> al = new ArrayList<>();
        al.add("[");
        al.add("/");
        al.add("]");

        Consumer<String> ax = string -> System.out.println(str);
        ax.accept("");

        al.forEach(string -> System.out.println());

        Function<Integer, String> x1 = num -> Integer.toString(num * num);

        String result = x1.apply(40);
        System.out.println(result);

        String result2 = x1.andThen(num -> {
            System.out.println("andThen의 실행 결과" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        Predicate<Integer> ff = num -> num % 2 == 0;

        List<Integer> nl = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nl.add(i + 1);

        }
        System.out.println(nl);

        List<Integer> nL = nl.stream().filter(ff).collect(Collectors.toList());
        System.out.println(nL);

        List<Integer> nL2 = nL.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(nL2);

    }

}