package com.softwareinstitute.andreeaholban;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "JK Rowling", Boolean.TRUE, "available");
        System.out.println(book.getTitle());

    }
}
