package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek produk dengan nama "Laptop", harga 15000000, dan stok 10
        Product product = new Product("Laptop", 15000000, 10);

        // 2. Membuat objek sales yang menggunakan objek product
        Sales sales = new Sales(product);

        // 4. Menjual produk dengan jumlah 5
        sales.sellProduct(5);

        // 5. Menambah stok produk sebanyak 5
        sales.restockProduct(5);

        // 6. Mengubah harga produk menjadi 14000000
        sales.updateProductPrice(14000000);

        // 7. Mencoba mengubah harga produk dengan nilai negatif (-5000)
        sales.updateProductPrice(-5000);
    }
}
