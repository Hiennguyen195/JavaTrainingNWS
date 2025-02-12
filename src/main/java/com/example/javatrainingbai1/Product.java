package com.example.javatrainingbai1;

public class Product{
    private String name;
    private Integer price;
    private String category;
    private Integer stock;

    public Product(String name, Integer price, String category, Integer stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Integer getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(Integer stock) {
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
