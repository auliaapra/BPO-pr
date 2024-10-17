import java.math.BigInteger; // Mengimpor kelas BigInteger untuk menangani bilangan besar
import java.util.Scanner; // Mengimpor Scanner untuk input pengguna

public class P3S6BigNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat Scanner untuk membaca input

        // Membaca input dua angka besar a dan b
        System.out.print("Masukkan angka pertama: ");
        BigInteger a = new BigInteger(input.nextLine()); // Membaca angka pertama sebagai BigInteger

        System.out.print("Masukkan angka kedua: ");
        BigInteger b = new BigInteger(input.nextLine()); // Membaca angka kedua sebagai BigInteger

        // Melakukan operasi penjumlahan a + b
        BigInteger hasilTambah = a.add(b); // Menjumlahkan a dan b

        // Melakukan operasi perkalian a * b
        BigInteger hasilKali = a.multiply(b); // Mengalikan a dan b

        // Mencetak hasil penjumlahan
        System.out.println(hasilTambah); // Mencetak hasil penjumlahan

        // Mencetak hasil perkalian
        System.out.println(hasilKali); // Mencetak hasil perkalian

        input.close(); // Menutup Scanner
    }
}
