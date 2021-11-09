package com.company;

public class BookTest{
    Book book = new Book("Dune", "X3", 1985, 365);
    void test() {
        System.out.println("Book test running..."+"\n");
        BookTest book_1 = new BookTest();
        System.out.println("BookTest{" +
                "name='" + book.name + '\'' +
                ", author='" + book.author + '\'' +
                ", year='" + book.year + '\'' +
                ", page_count='" + book.page_count + '\'' +
                '}'); ;
        System.out.println("\n"+"Book test end");
    }
}
