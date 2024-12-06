package com.library;

public abstract class User {
    private String name;
    private String userId;
    private String contactInfo;

    private static String generateUniqueID() {
        return "1";
    }
    public User(){
        this.userId = generateUniqueID();
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueID();
        this.name = name;
        this.contactInfo = contactInfo;

    }

    public User(User user){
        this.name = user.name;
        this.userId = generateUniqueID();
        this.contactInfo = user.contactInfo;

    }

     public abstract void displayDashboard();
     public abstract boolean canBorrowBooks();

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}

