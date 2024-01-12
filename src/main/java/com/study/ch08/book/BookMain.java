package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[2];
        BookList bl = new BookList(books);
        BookCheck bc = new BookCheck(bl);
        
        while (loopFlag) {
            System.out.println(" --- 도서 관리 프로그램 시작 --- ");
            System.out.println(" 1. 신규 도서 입력 >> ");
            System.out.println(" 2. 도서 목록 확인(제목 또는 저자) >> ");
            System.out.println(" 3. 이전 메뉴 돌아가기 ");
            System.out.println(" q. 선택을 마칩니다 ");
            System.out.print(" 메뉴 선택 >> ");
            selectedMenu = sc.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println(" 메뉴 선택을 마칩니다 ");
                loopFlag = false;
            } else if ("1".equals(selectedMenu)) {
                System.out.println(" >> 신규 도서 입력 페이지 << ");

                System.out.println("도서명: ");
                String title = sc.nextLine();
                System.out.println("저자: ");
                String author = sc.nextLine();

                Book newBook = new Book(title, author);
                bl.insert(newBook);

                System.out.println("신규 도서 등록 완료");
            } else if ("2".equals(selectedMenu)) {
                System.out.println(" 제목 또는 저자 입력 >> ");
                String input = sc.nextLine();



                } else {
                    System.out.println("다시 입력");
                }

            }

                }
            }


