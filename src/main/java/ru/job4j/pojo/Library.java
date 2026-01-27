package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book warAndPeace = new Book("War and Peace", 1000);
        Book warAndWorld = new Book("War and World", 1200);
        Book orwell1984 = new Book("1984", 400);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = warAndPeace;
        books[2] = warAndWorld;
        books[3] = orwell1984;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages() + " pages.");
        }
        System.out.println();
        Book tmpBook = books[0];
        books[0] = books[3];
        books[3] = tmpBook;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages() + " pages.");
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
            System.out.println(book.getName() + " - " + book.getPages() + " pages.");
            }
        }
    }
}
