package com.library;

public class NovelBook extends Book{

    private String genre;

    NovelBook(String title, String author, String isbn, String genre, String type){
        super(title,author,isbn,type);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.print("Title :"+this.getTitle());
        System.out.print("Author :"+this.getAuthor());
        System.out.print("ISBN :"+this.getIsbn());
        System.out.print("Subject : "+this.getGenre());
        System.out.println("------------------------------------------------------------");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
