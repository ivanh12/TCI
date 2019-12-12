import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

public class BookTest{
    @Test
    public void bookNameAndAuthorIsNotNullAndEmpty(){
        Book book = new Book("TCI", "Author");

        assertEquals("Name and/or author is null", "TCI", book.getName());
        assertEquals("Name and/or author is null", "Author", book.getAuthor());
    }

    @Test (expected = IllegalArgumentException.class)
    public void bookNameIsNullAndThrowIllegalArgumentException(){
        Book book = new Book("", "");
    }

    @Test (expected = IllegalArgumentException.class)
    public void bookAuthorIsNullAndThrowIllegalArgumentException(){
        Book book = new Book("", "");
    }

    @Test
    public void chapterAlreadyCreatedAndAddedToBook_IncrementChapterListSize(){
        Book book = new Book("Name", "Author");
        int sizeBefore = book.getChapterList().size();

        book.addNewChapter("Chapter name", "1.1");
        int sizeAfter = book.getChapterList().size();

        assertEquals("Chapter is not added to book", sizeBefore + 1, sizeAfter);
    }

    @Test
    public void chapterNameIsUnique(){
        Book book = new Book("Name", "Author");

        book.addNewChapter("Chapter 1", "1.1");
        book.addNewChapter("Chapter 2", "2.1");


    }

    @Test
    public void tableOfContentIsReturnedCorrectly(){

    }



}
