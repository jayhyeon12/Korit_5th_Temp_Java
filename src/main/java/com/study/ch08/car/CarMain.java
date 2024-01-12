package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3];
        CarRepository cr = new CarRepository(cars);
        CarService cs = new CarService(cr);

        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 종료");
            System.out.print("메뉴 선택 > ");
            selectedMenu = sc.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("메뉴 선택을 끝냅니다");
                loopFlag = false;
            } else if("1".equals(selectedMenu)) {
                System.out.println("<< 자동차 등록 페이지 >>");

                String model = null;
                String color = null;

                if(cs.isFull()) {
                    System.out.println("등록 불가");
                    continue;
                }

                System.out.println("모델명 > ");
                model = sc.nextLine();
                System.out.println("색상 > ");
                color = sc.nextLine();

                Car car = new Car(model, color); // entity

                cs.append(car);


            } else if("2".equals(selectedMenu)) {
                System.out.println("<< 자동차 조회 페이지 >>");
                cs.printCarList();

            } else {
                System.out.println("재입력");

            }
            System.out.println("프로그램 종료");
        }

    }
}