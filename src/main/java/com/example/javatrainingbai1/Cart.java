package com.example.javatrainingbai1;

import java.util.Scanner;
public class Cart {
    String addName;
    int addQuantity;

    // Phương thức thêm sản phẩm vào giỏ hàng add_Product()
    public void add_Product(String product, int quantity) {
        Scanner sc = new Scanner(System.in);

        int product_quantity = 0;
        System.out.print("Nhập tên sản phẩm bạn muốn thêm vào giỏ: ");
        product = sc.nextLine();
        System.out.print("Enter Product Quantity: ");
        quantity = sc.nextInt();

        addQuantity = quantity;
        if (product.equals(Product.name)) {
            product_quantity = product_quantity + quantity;
            System.out.println("Bạn đã thêm " + product_quantity + " sản phẩm " + Product.category + " " + product + " vào giỏ hàng!");
        } else {
            System.out.println("Sản phẩm không tồn tại! Xin vui lòng nhập lại!");
        }
    }


    // Phương thức trả lại giá của sản phẩm get_total_price
    public void get_total_Price() {
        double addPrice = Product.price * addQuantity;
        System.out.println("Số tiền mà bạn phải trả là: " + addPrice + " vnđ\n");
    }
}
//    public int getAddQuantity() {
//        return addQuantity;
//    }
//
//    public void setAddQuantity(int addQuantity) {
//        this.addQuantity = addQuantity;
//    }
//
//    public String getAddName() {
//        return addName;
//    }
//
//    public void setAddName(String addName) {
//        this.addName = addName;
//    }

