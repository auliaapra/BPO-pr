package com.polban.jtk.sales; // Mendefinisikan package tempat class berada

public class Product { // Mendeklarasikan class Product
    private String productName; // Mendeklarasikan variabel untuk nama produk
    private double price; // Mendeklarasikan variabel untuk harga produk
    private int stock; // Mendeklarasikan variabel untuk stok produk

    // Constructor
    public Product(String productName, double price, int stock) { // Constructor untuk menginisialisasi productName, price, dan stock
        this.productName = productName; // Menginisialisasi variabel productName
        this.price = price; // Menginisialisasi variabel price
        this.stock = stock; // Menginisialisasi variabel stock
    }

    // Getter for productName
    public String getProductName() { // Method untuk mendapatkan nama produk
        return productName; // Mengembalikan nilai dari productName
    }

    // Getter for price
    public double getPrice() { // Method untuk mendapatkan harga produk
        return price; // Mengembalikan nilai dari price
    }

    // Setter for price with validation
    public void setPrice(double price) { // Method untuk mengatur harga produk dengan validasi
        if (price > 0) { // Memeriksa apakah harga lebih dari 0
            this.price = price; // Jika valid, mengatur harga produk
        } else { // Jika harga tidak valid
            System.out.println("Harga tidak valid!"); // Menampilkan pesan kesalahan
        }
    }

    // Getter for stock
    public int getStock() { // Method untuk mendapatkan stok produk
        return stock; // Mengembalikan nilai dari stock
    }

    // Method to add stock with validation
    public void addStock(int amount) { // Method untuk menambah stok produk dengan validasi
        if (amount > 0) { // Memeriksa apakah jumlah yang ditambahkan lebih dari 0
            this.stock += amount; // Jika valid, menambahkan jumlah stok
        } else { // Jika jumlah tidak valid
            System.out.println("Jumlah stok tidak valid!"); // Menampilkan pesan kesalahan
        }
    }

    // Method to sell product with validation
    public void sellProduct(int quantity) { // Method untuk menjual produk dengan validasi
        if (quantity > 0 && quantity <= stock) { // Memeriksa apakah jumlah yang dijual valid dan stok mencukupi
            stock -= quantity; // Jika valid, mengurangi stok sesuai jumlah yang dijual
            System.out.println(quantity + " " + productName + " terjual."); // Menampilkan pesan jumlah produk terjual
        } else { // Jika jumlah tidak valid atau stok tidak cukup
            System.out.println("Jumlah stok tidak cukup untuk penjualan."); // Menampilkan pesan kesalahan
        }
    }
}
