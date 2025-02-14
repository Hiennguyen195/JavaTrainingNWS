package com.example.javatrainingbai1;

import java.util.List;
import java.util.ArrayList;

public class ProductManager {
    List<Product> products_List = new ArrayList<>();

    // Create product list:
    public void initProducts() {
        products_List.add(new Product("Kokomi", 12000, "Mỳ tôm", 500));
        products_List.add(new Product("HaoHao", 10000, "Mỳ tôm", 200));
        products_List.add(new Product("G7", 20000, "Cà phê", 300));
        products_List.add(new Product("Wakeup247", 15000, "Cà phê", 700));
    }
    // Printing list method:
    public void printOut_productList(){
        for (Product p : products_List) {
            System.out.println(p);
        }
    }
    // Get product method:
    public List<Product> getProducts() {
        return products_List;
    }
}
