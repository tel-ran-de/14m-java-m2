package de.telran.data;

public class Book {
    private String title;
    private String author;
    private int dateOfIssue;
    private int pages;

    public Book(String title, String author, int dateOfIssue, int pages) {
        this.title = title;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
        this.pages = pages;
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

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", pages=" + pages +
                '}';
    }
}
