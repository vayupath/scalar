package com.library;

public class TextBook extends Book {

    private String edition;
    private String subject;

    TextBook(String title, String author, String isbn,String edition, String subject,String type) {
        super(title,author,isbn,type);
        this.edition = edition;
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {

        System.out.println("Edition"+this.edition);
        System.out.println("Subject: "+this.subject);
    }
}
