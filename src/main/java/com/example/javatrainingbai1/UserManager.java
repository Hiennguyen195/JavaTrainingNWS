package com.example.javatrainingbai1;

public class UserManager {
    public static final String USERNAME = "hienminh195";
    public static final String PASSWORD = "123456789";

    public static boolean CheckLogin(String userName, String password) {
        if (USERNAME.equals(userName) && PASSWORD.equals(password)) {
            return true; // Đăng nhập thành công
        }
        return false; // Đăng nhập thất bại
    }
}
