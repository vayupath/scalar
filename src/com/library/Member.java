package com.library;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 4;


    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }
    public Member(String name, String contactInfo) {
        super(name,contactInfo);
        this.borrowedBooksCount = 0;

    }

    public void displayDashboard(){
        System.out.println(borrowedBooksCount);
    }

    public boolean canBorrowBooks() {
       return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public void returnBook() {
        borrowedBooksCount--;
    }

    @Override
    public void assignBook() {
        borrowedBooksCount++;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }
}
