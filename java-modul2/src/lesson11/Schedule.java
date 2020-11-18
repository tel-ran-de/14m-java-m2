package lesson11;

import java.util.Arrays;

// add film, delete film, displayFilms, display Films in cinema, display films by genre
public class Schedule {
    private Movie[] movies;
    int size;

    public Schedule(int capacity) {
        this.movies = new Movie[capacity];
        this.size = 0;
    }

    public void displayFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    public void displayFilmsByGenre(Genre genre) {
        for (int i = 0; i < size; i++) {
            Genre temp = movies[i].getGenre();
            if (temp.equals(genre)) {
                System.out.println("This film is in your wished Genre: " + temp + movies[i]);
                System.out.println("-------------------------");
            }
        }
    }

    public void displayFilmsByCinema(Cinema cinema) {
        for (int i = 0; i < size; i++) {
            Cinema[] temp = movies[i].getCinemas();
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(cinema)) {
                    System.out.println("In this Theatre this film: " + movies[i]);
                    System.out.println("-------------------------");
                }
            }
        }
    }

    public boolean deleteFilm(Movie movie) {
        for (int i = 0; i < size; i++) {
            if (movies[i].equals(movie)) {
                movies[i] = movies[size - 1];
                movies[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean addFilm(Movie movie) {
        if (size < movies.length) {
            movies[size] = movie;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }
}
