package com.softwareinstitute.andreeaholban.main;


import com.softwareinstitute.andreeaholban.main.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    void testGetTitle(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        assertEquals( "Pride and Prejudice", book.getTitle());
    }

    @Test
    void testGetAuthor(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        assertEquals( "Jane Austen", book.getAuthor());
    }
    

    @Test
    void testGetRefNo(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available", "38820");
        assertEquals("38820", book.getRefNumber());
    }

    void testSetRefNo(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available", "38820");
        book.setRefNumber("1234");
        assertEquals("1234", book.getRefNumber());
    }

}
