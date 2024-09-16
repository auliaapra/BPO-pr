package com.polban.jtk.sales;

// Deklarasi kelas Sales
public class Sales {
    // Variabel product dengan akses private dari kelas Product
    private Product product;

    // Konstruktor kelas Sales yang menerima parameter product
    public Sales(Product product) {
        this.product = product; // Inisialisasi variabel product
    }

    // Method untuk menjual produk berdasarkan jumlah
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan..."); // Menampilkan pesan penjualan
        product.sellProduct(quantity); // Memanggil method untuk menjual produk di kelas Product
        System.out.println("Stok setelah penjualan: " + product.getStock()); // Menampilkan stok terbaru setelah penjualan
    }

    // Method untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok..."); // Menampilkan pesan penambahan stok
        product.addStock(quantity); // Memanggil method untuk menambah stok di kelas Product
        System.out.println("Stok setelah penambahan: " + product.getStock()); // Menampilkan stok terbaru setelah penambahan
    }

    // Method untuk memperbarui harga produk
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk..."); // Menampilkan pesan pembaruan harga
        product.setPrice(newPrice); // Memanggil method untuk memperbarui harga di kelas Product
        System.out.printf("Harga baru: %.2f%n", product.getPrice()); // Menampilkan harga baru dengan format 2 angka desimal
    }
}
