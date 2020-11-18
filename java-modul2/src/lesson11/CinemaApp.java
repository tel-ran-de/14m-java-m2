package lesson11;

import java.time.LocalDate;

public class CinemaApp {
    public static void main(String[] args) {
        Address address1 = new Address("Lenina", 13);
        Address address2 = new Address("Breidtscheidplatz", 1);
        Address address3 = new Address("Potsdamer Platz", 24);
        Cinema cosmos = new Cinema("Cosmos", address1);
        Cinema zoo = new Cinema("ZooPalast", address2);
        Cinema uci = new Cinema("UCI", address3);
        Movie movie1 = new Movie("Space", LocalDate.of(2019, 7, 3),
                Genre.FANTASY_SCIFI, zoo);
        Movie movie2 = new Movie("FullMoon", LocalDate.of(2018, 6, 8), Genre.ROMANTIC, cosmos);
        Movie movie3 = new Movie("Minions", LocalDate.of(2018, 6, 8), Genre.CARTOON, zoo);
        Movie movie4 = new Movie("Dragon", LocalDate.of(2018, 6, 8), Genre.HORROR_THRILLER, cosmos);
        Movie movie5 = new Movie("StreetArt", LocalDate.of(2018, 6, 8), Genre.DRAMA, cosmos);
        Movie movie6 = new Movie("StreetArt2", LocalDate.of(2020, 6, 8), Genre.DRAMA, cosmos);
        Movie movie7 = new Movie("StreetArt3", LocalDate.of(2020, 6, 8), Genre.DRAMA, cosmos);
        Schedule plan = new Schedule(128);
        plan.addFilm(movie1);
        plan.addFilm(movie2);
        plan.addFilm(movie3);
        plan.addFilm(movie4);
        plan.addFilm(movie5);
        plan.addFilm(movie6);
        plan.addFilm(movie7);

       // plan.displayFilmsByCinema(zoo);
        plan.displayFilmsByGenre(Genre.DRAMA);
    }

}
