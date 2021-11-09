package com.company;

public class Book {
    String name, author;
    int year, page_count;

    public Book(String name, String author, int year, int page_count) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.page_count = page_count;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }
}
