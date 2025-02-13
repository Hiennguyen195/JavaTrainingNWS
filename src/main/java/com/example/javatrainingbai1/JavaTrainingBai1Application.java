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
//        Cart c1 = new Cart();
//        System.out.println("Nhập tên sản phẩm bạn muốn thêm vào giỏ hàng: ");
//        c1.setAddName(sc.next());
//        System.out.println("Giá của sản phẩm là: " + Math.round(haoHao.getPrice()) + " vnđ\n");
//        sc.nextLine();
//        System.out.print("Nhập số lượng bạn muốn thêm: ");
//        c1.setAddQuantity(Integer.parseInt(sc.next()));
//        System.out.print("Số tiền mà bạn phải trả là: ");
//        System.out.println(Math.round(c1.get_total_Price()) + " vnđ\n");
//        sc.nextLine();

        Cart c2= new Cart();
        c2.add_Product(null, 0);
        c2.get_total_Price();
    }

}
