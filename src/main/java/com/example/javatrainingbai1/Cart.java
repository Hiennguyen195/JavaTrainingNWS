package com.example.javatrainingbai1;

import java.util.Scanner;
public class Cart {
    String addName;
    int addQuantity;

    // Phương thức trả lại giá của sản phẩm
    public double get_total_Price() {
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
