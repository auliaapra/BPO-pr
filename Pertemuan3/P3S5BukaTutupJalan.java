import java.util.Scanner;

public class P3S5BukaTutupJalan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk membaca input

        // Membaca plat nomor 4 mobil dari pengguna
        System.out.print("Masukkan plat nomor 4 mobil (pisahkan dengan spasi): ");
        String[] platNomor = input.nextLine().split(" "); // Membaca input dan membagi menjadi array

        if (platNomor.length != 4) { // Memastikan ada 4 plat nomor yang dimasukkan
            System.out.println("Input harus 4 plat nomor.");
            input.close(); // Menutup scanner
            return; // Keluar dari program
        }

        // Menggabungkan semua plat nomor menjadi satu string
        StringBuilder gabungan = new StringBuilder();
        for (String plat : platNomor) {
            gabungan.append(plat); // Menambahkan plat nomor ke gabungan
        }

        // Mengubah gabungan string menjadi angka
        long gabunganAngka = Long.parseLong(gabungan.toString());

        // Menghitung hasil dan memeriksa apakah (gabungan - 999999) % 5 == 0
        if ((gabunganAngka - 999999) % 5 == 0) {
            System.out.println("Mobil harus berhenti dan memperbolehkan mobil dari arah bersebrangan jalan"); // Jika kondisi terpenuhi
        } else {
            System.out.println("Mobil harus jalan dan mobil dari arah bersebrangan berhenti"); // Jika kondisi tidak terpenuhi
        }

        input.close(); // Menutup scanner
    }
}
