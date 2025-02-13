package com.example.javatrainingbai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import javax.print.attribute.standard.PrinterURI;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
public class JavaTrainingBai1Application {

    public static void main(String[] args) {


        SpringApplication.run(JavaTrainingBai1Application.class, args);
        Scanner sc = new Scanner(System.in);
        // Bài 1:
        Product p1 = new Product("Kokomi", 12000, "Mỳ tôm", 500);
        Product p2 = new Product("HaoHao", 10000,"Mỳ tôm",200);
        Product p3 = new Product("G7", 20000, "Cà phê", 300);

        ArrayList<Product> products_List = new ArrayList<>();
        products_List.add(p1);
        products_List.add(p2);
        products_List.add(p3);

        for (Product product : products_List) {
            System.out.println(product);
        }

        // Bài 2:
        User u1= new User();
        System.out.println("Tên đăng nhập: ");
        u1.setuserName(sc.next());
        System.out.println("Mật khẩu: ");
        u1.setpassword(sc.next());
        u1.setemail(u1.getuserName() + "@gmail.com\n");

        if (LoginSystem.CheckLogin(u1.getuserName(), u1.getpassword())){
            System.out.println("Đăng nhập thành công!\n");
            u1.showInfo();
        } else{
            System.out.println("Đăng nhập thất bại!\n" );
        }

        // Bài 3:
        Cart c1= new Cart();
        c1.add_Product(null, 0);
        c1.get_total_Price();
        c1.remove_Product(null);
        c1.get_total_Price();
    }

}
