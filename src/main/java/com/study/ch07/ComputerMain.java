package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        Computer c1 = new Computer();  // 인스턴스 생성: 주소값을 리턴
        Computer c2 = new Computer("laptop");

        System.out.println(c1);
        System.out.println(c2);

        c1.cpu = "i5";
        c2.cpu = "i7";

        System.out.println(c1.cpu);
        System.out.println(c2.cpu);

        c1.showInfo();
        c2.showInfo();

        c1.ram = "8GB";
        c2.ram = "16GB";

        c1.showInfo();
        c2.showInfo();

        c1.type = "desktop";

    }
}