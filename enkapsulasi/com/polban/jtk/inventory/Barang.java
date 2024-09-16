package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang; // Deklarasi variabel untuk menyimpan kode barang
    private String nama_barang; // Deklarasi variabel untuk menyimpan nama barang
    private int stok; // Deklarasi variabel untuk menyimpan stok barang

    // Constructor
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode; // Inisialisasi kode barang dengan nilai dari parameter 'kode'
        this.nama_barang = nama; // Inisialisasi nama barang dengan nilai dari parameter 'nama'
        this.stok = stk; // Inisialisasi stok dengan nilai dari parameter 'stk'
    }

    // Getter untuk nama_barang
    public String getNamaBarang() {
        return nama_barang; // Mengembalikan nilai nama barang
    }

    // Getter untuk stok
    public int getStok() {
        return stok; // Mengembalikan nilai stok barang
    }

    // Method untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) { // Mengecek apakah jumlah stok yang ditambahkan lebih dari 0
            this.stok += jumlah; // Jika valid, tambahkan jumlah stok ke stok yang ada
        } else {
            System.out.println("Jumlah stok tidak valid. Harus lebih dari 0."); // Tampilkan pesan jika jumlah tidak valid
        }
    }
}
