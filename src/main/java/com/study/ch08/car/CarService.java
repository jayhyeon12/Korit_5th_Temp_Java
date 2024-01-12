package com.study.ch08.car;

public class CarService {
    CarRepository cr;

    public CarService(CarRepository cr) {
        this.cr = cr;
    }

    boolean isFull() {
        return cr.getEmptyIndex() == -1;
    }

    void append(Car car) {
        cr.insert(car);
    }

    void printCarList() {
        Car[] cars = cr.getCarDates();
        if(cars.length == 0) {
            System.out.println("등록된 차량 없음");
            return;
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

}