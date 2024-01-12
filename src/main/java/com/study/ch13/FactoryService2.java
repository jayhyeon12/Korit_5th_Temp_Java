package com.study.ch13;

import java.util.Scanner;

public class FactoryService2 {
    private Scanner sc;

    public FactoryService2(Scanner sc) {
        this.sc = sc;
    }

    public void create() {
        System.out.println("2에서 차량 생산");
        System.out.println("모델명 입력 >> ");
        String model = sc.nextLine();

        Factory f = Factory.getInstance();
        f.setFactoryName("제2 생산 공장");
        Car car = f.produce(model);
        System.out.println(car.toString());
    }

}
