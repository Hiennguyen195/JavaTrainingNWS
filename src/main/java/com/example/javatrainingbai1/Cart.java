package com.example.javatrainingbai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private int product_quantity;
    private List<Product> cart_products = new ArrayList<>();

    public Cart() {
    }

    public Cart(List<Product> cart_products) {
        this.cart_products = cart_products;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public List<Product> getCart_products() {
        return cart_products;
    }

    public void setCart_products(List<Product> cart_products) {
        this.cart_products = cart_products;
    }

    public Cart(int product_quantity, List<Product> cart_products) {
        this.product_quantity = product_quantity;
        this.cart_products = cart_products;
    }
}




