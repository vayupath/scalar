package com.library;

public class NovelBook extends Book{

    private String genre;

    NovelBook(String title, String author, String isbn, String genre, String type){
        super(title,author,isbn,type);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {

        System.out.println("Subject: "+this.genre);
    }

}
