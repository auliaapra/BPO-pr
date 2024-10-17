import java.util.Scanner;

public class P3S1StringTokenizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk membaca input

        System.out.print("Masukkan Teks = ");
        String inputan = input.nextLine(); // Membaca input string dari pengguna

        String[] tokens = inputan.trim().split("[^a-zA-Z]+"); // Memisahkan string menjadi token dengan regex

        if (inputan.trim().isEmpty()) { // Jika input hanya berisi spasi, cetak 0
            System.out.println(0);
        } else {
            System.out.println("Jumlah Token: " + tokens.length); // Mencetak jumlah token

            for (String token : tokens) { // Mencetak setiap token pada baris baru
                System.out.println(token);
            }
        }

    }
}