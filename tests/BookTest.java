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
    void testSetAuthor(){
        Book book = new Book("Pride and Prejudice", "JK Rowling", Boolean.TRUE, "available");
        book.setAuthor("Jane Austen");
        assertEquals( "Jane Austen", book.getAuthor());
    }


    @Test
    void testGetRefNo(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available", "38820");
        assertEquals("38820", book.getRefNumber());
    }

    @Test
    void testSetRefNo(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available", "38820");
        book.setRefNumber("1234");
        assertEquals("1234", book.getRefNumber());
    }

    @Test
    void testGetStatus(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        assertEquals("available", book.getStatus());
    }

    @Test
    void testSetStatus(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "unavailable");
        book.setStatus("available");
        assertEquals("available", book.getStatus());
    }

}
