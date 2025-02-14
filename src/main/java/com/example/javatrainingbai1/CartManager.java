package com.example.javatrainingbai1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CartManager {

    // Phương thức thêm sản phẩm vào giỏ hàng add_Product()
    public void add_Product() {
        Scanner sc = new Scanner(System.in);

        int product_quantity = 0;
        System.out.print("Please enter the product name that you would like to add: ");
        String addProduct = sc.nextLine();
        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();
    }


//        if (addProduct.equals(Product.name)) {
//            product_quantity = product_quantity + quantity;
//            System.out.println("Added " + product_quantity + addProduct + Product.category + " into the cart!");
//        } else {
//            System.out.println("The product is not in the cart!");
//        }
//    }

//    // Phương thức bỏ bớt sản phẩm ra khỏi giỏ hàng remove_Product()
//    public void remove_Product(String remove_Product) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập tên sản phẩm bạn muốn bỏ ra khỏi giỏ hàng: ");
//        remove_Product = sc.nextLine();
//        if (remove_Product.equals(cart_product_Name)) {
//            cart_product_Quantity = 0;
//            System.out.println("Bạn đã bỏ sản phẩm " + Product.category + " " + remove_Product + " ra khỏi giỏ hàng!");
//        } else {
//            System.out.println("Sản phẩm không có trong giỏ hàng! Xin mời nhập lại!");
//        }
//    }
//
//    // Phương thức trả lại giá của giỏ hàng get_total_price()
//    public void get_total_Price() {
//        double addPrice = Product.price * cart_product_Quantity;
//        System.out.println("Số tiền mà bạn phải trả là: " + Math.round(addPrice) + " vnđ\n");
//    }
//}

}
