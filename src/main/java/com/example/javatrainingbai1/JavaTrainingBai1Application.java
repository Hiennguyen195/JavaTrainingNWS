package com.example.javatrainingbai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaTrainingBai1Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpringApplication.run(JavaTrainingBai1Application.class, args);
        Product HaoHao = new Product("Hảo Hảo", 12000, "Mỳ tôm", 500);
        System.out.println(HaoHao.toString() + '\n');

        User u1= new User();
        System.out.println("Tên đăng nhập: ");
        u1.setuserName(sc.next());
        System.out.println("Mật khẩu: ");
        u1.setpassword(sc.next());
        u1.setemail(u1.getuserName() + "@gmail.com");

        if (LoginSystem.CheckLogin(u1.getuserName(), u1.getpassword())){
            System.out.println("Đăng nhập thành công!");
            u1.showInfo();
        } else{
            System.out.println("Đăng nhập thất bại!");
        }


    }

}
