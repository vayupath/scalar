package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();

    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }
    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public Book searchBooks(String criteria){
        for (Book book : bookInventory) {
            if (book.getTitle().equals(criteria) || book.getAuthor().equals(criteria)){
                return book;
            }
        }

        return null;

    }

    public Book searchBook(String criteria,String type){
        for (Book book : bookInventory) {
            if (book.getTitle().equals(criteria) ||
                    book.getAuthor().equals(criteria) &&
                            book.getType().equals(type)){
                return book;
            }
        }

        return null;

    }

}