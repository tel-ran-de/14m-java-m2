package de.telran.application;

import de.telran.data.Book;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Harry Potter",
                "Joan Rollings",
                435,
                2010);
        Book book2 = new Book(
                "Winnie the Pooh",
                "Alex Milan", 256, 1957);
        Book book3 = new Book(
                "Sherlock Holmes",
                "Artur Conan Doyle", 388, 1892);
        Book book4 = new Book(
                "Little prince",
                "Antoine de Saint-Exupery", 200, 1943);

    }
}
