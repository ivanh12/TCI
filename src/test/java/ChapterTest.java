import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ChapterTest {
    @Test
    public void chapterNameAndNumberIsNotNullAfterCreated(){
        Chapter chapter = new Chapter("Chapter Name", "1");

        boolean expect = true;
        boolean result = false;
        if(chapter.getNumber() != null || chapter.getName() != null){
            result = true;
        }

        assertEquals("Name and/or number is null", expect, result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void chapterNameIsNullAndThrowIllegalArgumentException(){
        Chapter chapter = new Chapter("", "");
    }

    @Test (expected = IllegalArgumentException.class)
    public void chapterNumberIsNullAndThrowIllegalArgumentException(){
        Chapter chapter = new Chapter("", "");
    }

    @Test
    public void numberIsStringWith2LevelMaxAfterCreated(){
        Chapter chapter = new Chapter("Chapter Name", "1.1");

        boolean expect = true;
        boolean result = false;
        if(chapter.getNumber().matches("\\d")){
            result = true;
        }else if(chapter.getNumber().matches("\\d+[.]\\d+")){
            result = true;
        }

        assertEquals("Level of Chapter is more than 2", expect, result);
    }







}