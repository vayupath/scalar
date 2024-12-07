package com.library;

public class Client {
    public static void main(String[] args) {
        Book b1 = new TextBook("History of India","Sidddharth","1234","v1","History","Text book");
        Book b2 = new NovelBook("champak","BC","23","comecis","novel");
        Book b3 = new TextBook("History of India","Sidddharth","1234","v1","History","Text book");

        Book b4 = new TextBook("History of India","Sidddharth","1234","v1","History","Text book");
        Book b5 = new TextBook("History of India","Sidddharth","1234","v1","History","Text book");


        User u1 = new Member("Siddharth","98302928");
        User u2 = new Member("prasad","98739376");

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
        b5.lend(u1);

       // System.out.println(u1.getBorrowedBooksCount());

    }
}
