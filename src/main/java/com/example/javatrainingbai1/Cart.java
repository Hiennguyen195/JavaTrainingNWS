package com.example.javatrainingbai1;

import java.util.Scanner;
public class Cart {
    String addName;
    int addQuantity;

    // Phương thức trả lại giá của sản phẩm
    public double returnPrice() {
        if (getAddName().equals(Product.name)) {
            double addPrice = Product.price * addQuantity;
            return addPrice;
        }
        else {
            System.out.println("Sản phẩm không tồn tại!");
        }
        return 0;
    }

    public int getAddQuantity() {
        return addQuantity;
    }

    public void setAddQuantity(int addQuantity) {
        this.addQuantity = addQuantity;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }
}



//class add_Product {
//    Scanner sc = new Scanner(System.in);
//
//    public void addProduct() {
//        System.out.println("Enter product name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter quantity: ");
//        int quantity = sc.nextInt();
//        double addPrice = Product.price * quantity;
//
//        Cart cart = new Cart(name, 0, null, null);
//        cart.setName(name);
//        cart.quantity = quantity;
//        cart.price = addPrice;
//    }
//}