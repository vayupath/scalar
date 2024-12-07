package com.library;

public class Librarian extends User {
    private String employeeNumber;

    Librarian(String name, String contactInfo,String employeeNumber){
        super(name,contactInfo);
        this.employeeNumber = employeeNumber;

    }
    public void displayDashboard(){
        System.out.println("Name: "+getName());

    }


    public boolean canBorrowBooks() {
       return true;
    }

    void addNewBook(){

    }

    void removeBook(){

    }

    @Override
    public void returnBook() {
        System.out.println("Book Returned");
    }

    @Override
    public void assignBook() {
        System.out.println("assigned books");
    }
}
