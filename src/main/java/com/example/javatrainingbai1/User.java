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

class LoginSystem {
    public static final String USERNAME = "hienminh195";
    public static final String PASSWORD = "123456789";

    public static boolean CheckLogin(String userName, String password){
        if (USERNAME.equals(userName) && PASSWORD.equals(password)) {
            return true; // Đăng nhập thành công
        }
        return false; // Đăng nhập thất bại
    }
}

