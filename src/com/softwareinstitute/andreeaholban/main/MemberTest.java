package com.softwareinstitute.andreeaholban.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;


public class MemberTest {

    @Test
    void testSetName(){
        Member person = new Member("Andreea Holban", "12345");
        person.setName("Henry Barrington");
        assertEquals("Henry Barrington", person.getName());
    }

    @Test
    void testSetCardID(){
        Member person = new Member("Andreea Holban", "12345");
        person.setCardID("54321");
        assertEquals("54321", person.getCardID());
    }

    @Test
    void testSetIssuedDate(){
        Member person = new Member("Andreea Holban", "12345", LocalDate.of(2019, 9, 2), 0);
        person.setIssuedDate(LocalDate.of(2017, 7, 5));
        assertEquals(LocalDate.of(2017, 7, 5), person.getIssuedDate());
    }

    @Test
    void testSetNoBooksBorrowed(){
        Member person = new Member("Andreea Holban", "12345", LocalDate.of(2019, 9, 2), 0);
        person.setNumberBooksBorrowed(3);
        assertEquals(3, person.getNumberBooksBorrowed());
    }

    @Test
    void testReadingInLibrary(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setCopiesAvailable(4);
        person.readingInLibrary(book);
        assertEquals(3, book.getCopiesAvailable());
    }

    @Test
    void testFinishedReading(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setCopiesAvailable(4);
        person.finishedReading(book);
        assertEquals(5, book.getCopiesAvailable());
    }

    @Test
    void testBookCantBeBorrowed(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.FALSE, "available");
        String result = person.borrow(book);
        assertEquals("Item can't be borrowed", result);
    }

    @Test
    void testNoCopiesAvailable(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setCopiesAvailable(0);
        String result = person.borrow(book);
        assertEquals("No copies of this item are currently available", result);
    }

    @Test
    void testTooManyBooksBorrowed(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        person.setNumberBooksBorrowed(6);
        String result = person.borrow(book);
        assertEquals("You have reached the maximum amount of books you can borrow at once", result);
    }

    @Test
    void testBorrowDigitalBook(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setFormat("digital");
        book.setCopiesAvailable(4);
        String result = person.borrow(book);
        assertEquals(4, book.getCopiesAvailable(), "Number of copies available has changed");
        assertEquals("Successfully borrowed", result, "Wrong output");
    }

    @Test
    void testSuccesfullyBorrowed(){
        Member person = new Member("Andreea Holban", "12345");
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        String result = person.borrow(book);
        assertEquals("Successfully borrowed", result);
    }
}
