package com.softwareinstitute.andreeaholban;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "JK Rowling", Boolean.TRUE, "available");
        System.out.println(book.getTitle());
        System.out.println(book.getCopiesAvailable());
        Member Henry = new Member("Henry");
        System.out.println(Henry.borrow(book));
        System.out.println(book.getCopiesAvailable());
    }
}
