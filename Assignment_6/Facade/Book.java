package Assignments.Assignment_6.Facade;

public class Book {
    private long id;
    private String title;
    private String author;
    private boolean busy;

    public Book(long id, String title, String author, boolean busy) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.busy = busy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
}
