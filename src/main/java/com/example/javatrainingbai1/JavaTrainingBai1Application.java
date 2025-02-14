package com.example.javatrainingbai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
public class JavaTrainingBai1Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaTrainingBai1Application.class, args);
        Scanner sc = new Scanner(System.in);

        // Bài 1:
        ProductManager productManager = new ProductManager();
        productManager.initProducts();
        productManager.printOut_productList();

        // Bài 2:
        User u1 = new User();
        System.out.println("Tên đăng nhập: ");
        u1.setuserName(sc.next());
        System.out.println("Mật khẩu: ");
        u1.setpassword(sc.next());
        u1.setemail(u1.getuserName() + "@gmail.com\n");

        if (UserManager.CheckLogin(u1.getuserName(), u1.getpassword())){
            System.out.println("Đăng nhập thành công!\n");
            u1.showInfo();
        } else{
            System.out.println("Đăng nhập thất bại!\n" );
        }

        // Bài 3:
        Cart c1= new Cart();
        c1.add_Product();
//        c1.get_total_Price();
//        c1.remove_Product(null);
//        c1.get_total_Price();
    }

}
