package lesson11;

import java.time.LocalDate;
import java.util.Arrays;

public class Movie {
    private String title;
    private LocalDate date;
    private Genre genre;
    private Cinema[] cinemas;

    public Movie(String title, LocalDate date, Genre genre, Cinema... cinemas) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.cinemas = cinemas;
    }

    public Genre getGenre() {
        return genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    @Override
    public String toString() {
        return "\nMovie:" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", genre=" + genre +
                ", cinemas=" + Arrays.toString(cinemas) +
                '}';
    }
}
