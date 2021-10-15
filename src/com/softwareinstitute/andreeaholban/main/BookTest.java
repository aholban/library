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
    
}
