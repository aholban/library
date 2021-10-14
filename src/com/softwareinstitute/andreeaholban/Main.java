package com.softwareinstitute.andreeaholban;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "JK Rowling", Boolean.FALSE, "available");
        System.out.println(book.getTitle());

        Member Henry = new Member();
        System.out.println(Henry.borrow(book));
    }
}
