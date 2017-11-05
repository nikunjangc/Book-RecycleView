package nyc.c4q.bookrecycleview.model;

/**
 * Created by Nikunjan on 11/5/17.
 */

public class Book {
   private int image;
   private String title;
   private String writer;
   private String publishedYear;

    public Book(int image, String title, String writer, String publishedYear) {
       this.image=image;
        this.title = title;
        this.writer = writer;
        this.publishedYear = publishedYear;
    }
    public int getImage(){
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getPublishedYear() {
        return publishedYear;
    }
}



