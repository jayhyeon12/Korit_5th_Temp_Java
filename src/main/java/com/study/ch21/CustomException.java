package com.study.ch21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 멤버 추가 중 예외 생성");
            System.out.println("2. 멤버 조회 중 예외 생성");
            System.out.println("q. 프로그램 종료");
            System.out.print(" 항목 선택 >> ");
            String selectedMenu = sc.nextLine();
            try {
                if ("q".equalsIgnoreCase(selectedMenu)) {
                    break;
                } else if ("1".equals(selectedMenu)) {
                    throw new IndexOutOfBoundsException("강제 예외 생성");
                } else if ("2".equals(selectedMenu)) {
                    Map<String, Object> errorMap = new HashMap<>();
                    errorMap.put("errorCode", 291);
                    errorMap.put("errorMessage", "요청 데이터 누락");

                    throw new ResponseException("응답 예외", errorMap);
                } else {
                    System.out.println(" 재입력 필요 ");
                }

            } catch(IndexOutOfBoundsException e) {
                e.printStackTrace();
                // System.out.println(e.getMessage());
            } catch(ResponseException e) {
                e.printStackTrace();
                // System.out.println(e.getMessage());
                System.out.println(e.getErrorMap());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("--- 프로그램 종료 ---");
    }

}