package lesson7;

import lombok.Data;

@Data
@DBTable
public class Book {

    @DBField(type = "INTEGER")
    private int bookId;

    @DBField(type = "TEXT")
    private String title;

    @DBField(type = "TEXT")
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}
