package com.example.javatrainingbai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import javax.print.attribute.standard.PrinterURI;
import javax.swing.JOptionPane;
import java.util.Random;

@SpringBootApplication
public class JavaTrainingBai1Application {

    public static void main(String[] args) {

        // Bài 1:
        Scanner sc = new Scanner(System.in);
        SpringApplication.run(JavaTrainingBai1Application.class, args);
        Product koKoMi = new Product("Kokomi", 12000, "Mỳ tôm", 500);
        System.out.println(koKoMi.toString() + '\n');
        Product trungNguyen_g7 = new Product("G7", 35000,"Cà phê",200);
        System.out.println(trungNguyen_g7.toString() + '\n');

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
