package com.study.ch21;

import java.util.ArrayList;

public class ExceptionMain2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("213");
        al.add("214");
        al.add(null);
        al.add("216");
        al.add("217");

        try{
            for (int i = 0; i < 5; i++) {
                String name = al.get(i);
                if (name.equals("217")) {
                    System.out.println("똑똑, 217?");
                    }
                }
            } catch(NullPointerException e) {
                e.printStackTrace();
            } catch(IndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("반드시 실행");
            }

            System.out.println("예외 발생했으나 프로그램 정상 종료");
        }
}