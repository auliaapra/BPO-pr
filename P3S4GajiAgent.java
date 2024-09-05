import java.util.Scanner;

public class P3S4GajiAgent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk membaca input

        int gajiPokok = 500000; // Gaji pokok agent
        int hargaItem = 50000; // Harga setiap item yang dijual

        // Meminta pengguna untuk memasukkan jumlah penjualan bulan ini
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int penjualan = input.nextInt(); // Membaca jumlah penjualan dari input pengguna

        int totalGaji = gajiPokok; // Awalnya total gaji sama dengan gaji pokok

        if (penjualan >= 80) { // Jika penjualan lebih dari atau sama dengan 80 item
            totalGaji += penjualan * hargaItem * 0.35; // Bonus 35% dari total penjualan
        } else if (penjualan >= 40) { // Jika penjualan antara 40 hingga 79 item
            totalGaji += penjualan * hargaItem * 0.25; // Bonus 25% dari total penjualan
        } else if (penjualan < 15) { // Jika penjualan di bawah 15 item
            // Menghitung denda berdasarkan selisih dari 15 item
            int minusItem = 15 - penjualan;
            totalGaji -= minusItem * hargaItem * 0.15; // Denda sebesar 15% untuk item yang kurang
        } else { // Jika penjualan antara 15 hingga 39 item
            totalGaji += penjualan * hargaItem * 0.10; // Bonus 10% dari total penjualan
        }

        // Mencetak total gaji yang diterima
        System.out.println("Gaji yang diterima: Rp" + totalGaji);

        input.close(); // Menutup scanner
    }
}
