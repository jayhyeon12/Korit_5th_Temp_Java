package com.study.ch13;

import lombok.Setter;

import java.util.ArrayList;

public class Factory {
    private static Factory instance; // 클래스 변수: 자신 클래스를 static 변수로 지정
    @Setter
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 856;

    // 생성자는 private으로 지정해 외부 생성 차단
    private Factory() {

    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        ArrayList<String> strList = new ArrayList<>();
        return instance;
    }

//  public void setFactoryName(String factoryName) {
//      this.factoryName = factoryName;
//  }

    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }

}