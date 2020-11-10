package de.telran.dao;

import de.telran.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public boolean addBook(Book kniga) {
        if (size < books.length) {
            books[size] = kniga;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBookFromArray(Book kniga) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(kniga)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                // теоретически работает и без неё но с интересным эффектом
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayDeleteBook() {
        System.out.println(books[size - 1]);
        System.out.println(books[size]);
        System.out.println(books[size + 1]);
    }

    public void displayAllArray() {
        for (Book element : books) {
            System.out.println(element);
        }
    }
}
