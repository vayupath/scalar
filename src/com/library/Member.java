package com.library;

public class Member extends User {
    private int borrowedBooksCount;
    int MAX_BORROW_LIMIT = 5;

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name,contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;

    }

    public void displayDashboard(){
        System.out.println(borrowedBooksCount);
    }

    public boolean canBorrowBooks() {
        if (borrowedBooksCount < MAX_BORROW_LIMIT) {
            return true;
        }

        return false;
    }

}
