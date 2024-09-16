package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;  // Array untuk menyimpan barang

    // Method untuk inisialisasi barang
    void initBarang() {
        barangs = new Barang[2];  // Membuat array Barang dengan kapasitas 2
        barangs[0] = new Barang("001", "Baju", 10);  // Menambahkan barang pertama dengan kode "001", nama "Baju", dan stok 10
        barangs[1] = new Barang("002", "Celana", 20);  // Menambahkan barang kedua dengan kode "002", nama "Celana", dan stok 20
    }

    // Method untuk menampilkan barang
    void showBarang() {
        // Menampilkan nama dan stok barang pertama
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        // Menampilkan nama dan stok barang kedua
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }

    // Method untuk pengadaan stok barang
    void pengadaan() {
        initBarang();  // Inisialisasi barang sebelum pengadaan
        barangs[0].tambahStok(20);  // Menambah stok barang pertama sebanyak 20
        // Tidak bisa dilakukan pengurangan atau operasi aritmatika lain
        // karena stok dilindungi dalam kelas Barang.

        showBarang();  // Menampilkan stok barang setelah pengadaan
    }

    // Main method
    public static void main(String[] args) {
        Inventori beli = new Inventori();  // Membuat objek Inventori
        beli.pengadaan();  // Melakukan pengadaan barang
    }
}
