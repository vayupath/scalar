package com.library;

public abstract class Book implements Lendable{
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private String type;


    Book(){
        isAvailable = true;
    }

    Book(String title, String author, String isbn,String type){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.type = type;
        isAvailable = true;

    }

    Book(Book book){
        this.title = book.title;
        this.author = book.author;
        this.isbn = book.isbn;
        this.type = book.type;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()){
            user.assignBook();
            isAvailable = false;
            return true;
        }
        if (!user.canBorrowBooks()){
            System.out.println("User "+user.getName()+" cannot borrow books");
        }
        return false;
    }

    @Override
    public void returnBook(User user) {

        isAvailable = true;
        user.returnBook();
    }

    @Override
    public boolean isAvailable(User user) {
        return isAvailable;
    }

    public abstract void displayBookDetails();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
