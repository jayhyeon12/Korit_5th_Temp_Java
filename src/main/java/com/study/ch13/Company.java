package com.study.ch13;

/** 싱글톤(single tone)
 * Company 클래스를 싱글톤을 적용하여 작성
 */

public class Company {
    private static Company instance;
    private String name;

    private Company() {

    }

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

}
