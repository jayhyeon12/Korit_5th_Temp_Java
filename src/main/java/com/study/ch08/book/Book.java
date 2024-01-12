package com.study.ch08.book;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        if (title == null || author == null) {
            throw new IllegalArgumentException("제목과 저자는 빈 값이 불가능합니다");
        }
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}