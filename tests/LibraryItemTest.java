import com.softwareinstitute.andreeaholban.main.Book;
import com.softwareinstitute.andreeaholban.main.Document;
import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class LibraryItemTest {

    @Test
    void testSetTitle(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setTitle("Emma");
        Document document = new Document("", "", null, "", Boolean.TRUE, "", "", 1, 1, 0, null);
        document.setTitle("Automatic summarization");
        assertEquals("Emma", book.getTitle());
        assertEquals("Automatic summarization", document.getTitle());
    }

    @Test
    void testSetPublicationDate(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setPublicationDate(LocalDate.of(2017, 7, 5));
        assertEquals(LocalDate.of(2017, 7, 5), book.getPublicationDate());
    }

    @Test
    void testSetISBN(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setISBN("12345");
        assertEquals("12345", book.getISBN());
    }

    @Test
    void testSetBorrowable(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setBorrowable(Boolean.FALSE);
        assertEquals(Boolean.FALSE, book.getBorrowable());
    }

    @Test
    void testSetFormat(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setFormat("digital");
        assertEquals("digital", book.getFormat());
    }

    @Test
    void testSetSection(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setSection("Romance");
        assertEquals("Romance", book.getSection());
    }

    @Test
    void testSetShelf(){
        Book book = new Book("Pride and Prejudice", "Jane Austen", Boolean.TRUE, "available");
        book.setShelf(4);
        assertEquals(4, book.getShelf());
    }


}
