package com.example.javatrainingbai1;

public class Product{
     static String name;
     static double price;
     static String category;
     static int stock;

    public Product(String name, Integer price, String category, Integer stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return  "Tên sản phẩm: " + name + '\n' +
                "Giá sản phẩm: " + price + " vnđ" + '\n' +
                "Danh mục sản phẩm: " + category + '\n' +
                "Số lượng trong kho: " + stock ;
    }
}
