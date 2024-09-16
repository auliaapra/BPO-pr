package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        // 1. Create product object with stock 10
        Product product = new Product("Laptop", 15000000, 10);

        // 2. Create sales object
        Sales sales = new Sales(product);

        // 4. Sell product with quantity 5
        sales.sellProduct(5);

        // 5. Restock product
        sales.restockProduct(5);

        // 6. Update product price
        sales.updateProductPrice(14000000);

        // 7. Try updating product price with a negative value
        sales.updateProductPrice(-5000);
    }
}
