package com.polban.jtk.sales;

public class Product {
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    // Getter for stock
    public int getStock() {
        return stock;
    }

    // Method to add stock with validation
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    // Method to sell product with validation
    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}
