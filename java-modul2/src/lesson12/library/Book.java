package lesson12.library;

import java.time.LocalDate;

public class Book {
    private String title;
    private Person author;
    private LocalDate date;
    private Genre[] genres;

    public Book(String title, Person author, LocalDate date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public void setGenres(Genre... genres) {
        this.genres = genres;
    }
}
