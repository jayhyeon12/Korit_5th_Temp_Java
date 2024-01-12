package com.study.ch08;

/*
 자전거의 특성(색상, 브랜드, 가격, 생산년도, 바퀴 수)
 자전거의 정보를 나타내는 메소드, 자전거가 달릴 수 있게 하는 메소드 생성
*/

public class Bicycle {
    String color;
    String pattern;
    String price;
    int productionYear;
    int wheel;

    public Bicycle(String color, String pattern, int wheel, int productionYear, String price) {
        this.color = color;
        this.pattern = pattern;
        this.wheel = wheel;
        this.productionYear = productionYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "color = '" + color + '\'' +
                ", pattern = '" + pattern + '\'' +
                ", price = " + price +
                ", productionYear = " + productionYear +
                ", wheel = '" + wheel + '\'' +
                '}';
    }

    void Ride() {
        System.out.println("사람이 " + wheel + "발 자전거를 타고 달립니다");

    }


    void showInfo() {
            System.out.println("color: " + color);
            System.out.println("pattern: " + pattern);
            System.out.println("wheel: " + wheel);
            System.out.println("productionyear: " + productionYear);
            System.out.println("price: " + price);


        }


    }