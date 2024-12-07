package com.library;

import java.awt.print.Book;

public interface Lendable {

    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable(User user);
}
