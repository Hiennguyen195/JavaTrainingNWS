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
        UserManager user_manager = new UserManager();
        user_manager.initUser();
        user_manager.loginUser();

        // Bài 3:
//        Cart c1= new Cart();
//        c1.add_Product();
//        c1.get_total_Price();
//        c1.remove_Product(null);
//        c1.get_total_Price();
    }

}
