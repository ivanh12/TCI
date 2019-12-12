import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private List<Chapter> chapterList = new ArrayList<>();

    public Book(String name, String author) {
        if(name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("The name cannot be blank or null!");
        }
        if(author.isBlank() || author.isEmpty()){
            throw new IllegalArgumentException("The number cannot be blank or null!");
        }
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public void addNewChapter(String name, String number){
        Chapter chapter = new Chapter(name, number);
        for(Chapter ch : chapterList){
            if(ch.getName().equals(chapter.getName()) || ch.getNumber().equals(chapter.getNumber()) ){
                throw new IllegalArgumentException("Chapter should be unique");
            }
        }
        chapterList.add(chapter);
    }
}
