package com.example.javatrainingbai1;

public class Product {
    private String name;
    private double price;
    private String category;
    private int stock;

    //Main constructor
    public Product(String name, int price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    //Sub constructor
    public Product() {
    }

    //Getter
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
    //Setter
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
        return "Product{name= '" + name + "', price= " + Math.round(price) + " vnđ" +
                ", category= '" + category + "', stock= " + stock + "}";
    }
}

