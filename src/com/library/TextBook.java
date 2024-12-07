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
        System.out.print("Title :"+this.getTitle());
        System.out.print("Author :"+this.getAuthor());
        System.out.print("ISBN :"+this.getIsbn());
        System.out.print("Edition :"+this.getEdition());
        System.out.print("Subject : "+this.getSubject());
        System.out.println("------------------------------------------------------------");

    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
