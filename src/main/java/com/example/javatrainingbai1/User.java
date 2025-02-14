package com.example.javatrainingbai1;

public class User {
    private String userName;
    private String password;
    private String email;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.email = userName + "@gmail.com";
    }

    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    public User() {
    }

    public void showInfo() {
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
    }
}

