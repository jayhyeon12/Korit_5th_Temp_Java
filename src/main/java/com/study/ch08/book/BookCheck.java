package com.study.ch08.book;

public class BookCheck {
    BookList bl;

    public BookCheck(BookList bl) {
        this.bl = bl;
    }

    boolean isFull() {
        return bl.getEmptyIndex() == -1;
    }

    void append(Book books) {
        if (!isFull()) {
            bl.insert(books);
            System.out.println("도서 추가 완료");
        } else {
            System.out.println("도서 목록이 가득 차 도서 추가 불가");
        }
    }

    void checkBookList() {
        Book[] books = bl.getBookList();
        if (books.length == 0) {
            System.out.println("등록된 도서 없음");
        } else {
            System.out.println("도서 목록: ");
            for (Book book : books) {
                System.out.println(book.toString());

            }
        }
    }
}