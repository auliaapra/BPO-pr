import java.util.Scanner;

public class P3S2OutputFormatting {

    public static void main(String[] args) {
        // Membuat array untuk menyimpan 3 string
        String[] string = new String[3];
        // Membuat array untuk menyimpan 3 integer
        int[] number = new int[3];

        System.out.println("Masukkan String dan Nomor [3x]: ");
        // Membuka Scanner untuk membaca input dari pengguna
        try (Scanner scan = new Scanner(System.in)) {
            // Loop untuk membaca 3 pasang input (string dan integer)
            for (int i = 0; i < 3; i++) {
                string[i] = scan.next(); // Membaca string
                number[i] = scan.nextInt(); // Membaca integer
            }

            // Mencetak garis pemisah
            System.out.println("================================");

            // Loop untuk mencetak string dan integer yang telah diformat
            for (int i = 0; i < 3; i++) {
                // Memformat string (lebar 15 karakter, kiri rata) dan angka (3 digit dengan
                // padding nol)
                System.out.printf("%-15s%03d%n", string[i], number[i]);
            }

            // Mencetak garis pemisah
            System.out.println("================================");
        }
    }
}
