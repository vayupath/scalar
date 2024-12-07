package com.library;

public class Client {
    public static void main(String[] args) {

        Book b1 = new TextBook("History of India","K.C bose","1234","v1","History","Text book");
        Book b2 = new NovelBook("Champak","K Thakur","23","comecis","novel");
        Book b3 = new TextBook("Political Science","Ramesh jain","1234","v1","Political","Text book");

        Book b4 = new TextBook("Moral Science","Jeevan","1234","v1","Science","Text book");
        Book b5 = new TextBook("Social Science","Iriish","1234","v1","Science","Text book");


        User u1 = new Member("Jack","australia");
        User u2 = new Member("Rahul","india");

        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook(b1);
        lms.addBook(b2);
        lms.addBook(b3);
        lms.addBook(b4);
        lms.addBook(b5);
        lms.addUser(u1);
        lms.addUser(u2);

        b1.lend(u1);
        b2.lend(u1);
        b3.lend(u1);
        b4.lend(u1);

        b4.returnBook(u1);
        b4.lend(u2);

        lms.displayAllBooks();
        lms.displayRegisteredUsers();

        Book book = lms.searchBooks("K.C bose");
        if (book != null) {
            book.displayBookDetails();
        }

        Book book1 = lms.searchBooks("jeevan","Text book");
        if (book1 != null) {
            book1.displayBookDetails();
        }





       // System.out.println(u1.getBorrowedBooksCount());

    }
}
