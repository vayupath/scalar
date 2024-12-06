package com.library;

abstract public class User {
    private String name;
    private String userId;
    private String contactInfo;

    public static String generateUniqueID() {
        return "1";
    }
    public User(){
        this.userId = generateUniqueID()
    }

    public User(String name, String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;

    }

    public User(User user){
        this.name = user.name;
        this.userId = user.userId;
        this.contactInfo = user.contactInfo;

    }

    abstract public void displayDashboard();
    abstract public boolean canBorrowBooks();

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

