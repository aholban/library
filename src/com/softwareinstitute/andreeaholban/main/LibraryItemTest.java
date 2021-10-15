package com.softwareinstitute.andreeaholban.main;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class LibraryItemTest {

    @Test
    void testSetTitle(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setTitle("Emma");
        assertEquals("Emma", book.getTitle());
    }

    @Test
    void testSetPublicationDate(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setPublicationDate(LocalDate.of(2017, 7, 5));
        assertEquals(LocalDate.of(2017, 7, 5), book.getPublicationDate());
    }
}
