package com.example.javatrainingbai1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final List<User> user_List = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void initUser() {
        user_List.add(new User("hienminh195", "123456789"));
        user_List.add(new User("thienanh123", "123456789!"));
        user_List.add(new User("manhhung456", "123456789@"));
    }

    public void loginUser() {
        User u1 = new User();
        System.out.print("Tên đăng nhập: ");
        u1.setuserName(sc.nextLine());

        System.out.print("Mật khẩu: ");
        u1.setpassword(sc.nextLine());

        u1.setemail(u1.getuserName() + "@gmail.com\n");

        if (UserManager.CheckLogin(u1.getuserName(), u1.getpassword())) {
            System.out.println("Đăng nhập thành công!\n");
            u1.showInfo();
        } else {
            System.out.println("Đăng nhập thất bại!\n");
        }
    }

    public static boolean CheckLogin(String userName, String password) {
        for (User u : user_List) {
            if (u.getuserName().equals(userName) && u.getpassword().equals(password)) {
                return true; // Login success
            }
        }
        return false; // Login fail
    }
}



