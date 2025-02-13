package com.example.javatrainingbai1;

import java.util.Scanner;
public class Cart {

    int cart_product_Quantity;
    String cart_product_Name;

    // Phương thức thêm sản phẩm vào giỏ hàng add_Product()
    public void add_Product(String addProduct, int quantity) {
        Scanner sc = new Scanner(System.in);

        int product_quantity = 0;
        System.out.print("Nhập tên sản phẩm bạn muốn thêm vào giỏ: ");
        addProduct = sc.nextLine();
        System.out.print("Enter Product Quantity: ");
        quantity = sc.nextInt();

        cart_product_Name = addProduct;
        cart_product_Quantity = quantity;

        if (addProduct.equals(Product.name)) {
            product_quantity = product_quantity + quantity;
            System.out.println("Bạn đã thêm " + product_quantity + " sản phẩm " + Product.category + " " + addProduct + " vào giỏ hàng!");
        } else {
            System.out.println("Sản phẩm không tồn tại! Xin vui lòng nhập lại!");
        }
    }

    // Phương thức bỏ bớt sản phẩm ra khỏi giỏ hàng remove_Product()
    public void remove_Product(String remove_Product) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm bạn muốn bỏ ra khỏi giỏ hàng: ");
        remove_Product = sc.nextLine();
        if (remove_Product.equals(cart_product_Name)) {
            cart_product_Quantity = 0;
            System.out.println("Bạn đã bỏ sản phẩm " + Product.category + " " + remove_Product + " ra khỏi giỏ hàng!");
        }
        else {
            System.out.println("Sản phẩm không có trong giỏ hàng! Xin mời nhập lại!");
        }
    }

    // Phương thức trả lại giá của giỏ hàng get_total_price()
    public void get_total_Price() {
        double addPrice = Product.price * cart_product_Quantity;
        System.out.println("Số tiền mà bạn phải trả là: " + Math.round(addPrice) + " vnđ\n");
    }
}


