package com.library;

public abstract class User {
    private String name;
    private String userId;
    private String contactInfo;

    private static int totalUsers = 0;

    public int getTotalUsers() {
        return totalUsers;
    }

    protected final String generateUniqueID() {
        totalUsers++;
        return "User_" + totalUsers;
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
     public abstract void returnBook();
     public abstract void assignBook();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

