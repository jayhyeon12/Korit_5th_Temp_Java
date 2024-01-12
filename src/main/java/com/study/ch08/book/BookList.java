package com.study.ch08.book;

public class BookList {
    private Book[] books;

    BookList(Book[] books) {
        this.books = books;
    }

    int getEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Book book) {
        int emptyIndex = getEmptyIndex();
        if (emptyIndex != -1) {
            books[emptyIndex] = book;
            System.out.println("도서 등록 완료");
        } else {
            System.out.println("도서 목록이 가득 차 등록 불가");
        }
    }

    public Book[] getBookList() {
        int nonEmptyCount = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                nonEmptyCount++;
            }
        }

        Book[] nonEmptyBooks = new Book[nonEmptyCount];
        int index = 0;
        for (Book book : books) {
            if (book != null) {
                nonEmptyBooks[index++] = book;
            }
        }
        return nonEmptyBooks;

    }
}