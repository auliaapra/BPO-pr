import java.util.Scanner;

public class P3S3Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk membaca input

        System.out.println("Format: A<spasi>Operator<spasi>B");
        System.out.println("Misal: 60 + 1");
        // Membaca input (angka pertama, operator, angka kedua)
        int A = input.nextInt(); // Membaca angka pertama
        char operator = input.next().charAt(0); // Membaca operator
        int B = input.nextInt(); // Membaca angka kedua

        int result = 0; // Variabel untuk menyimpan hasil operasi

        // Menggunakan switch case untuk menentukan operasi berdasarkan operator
        switch (operator) {
            case '+':
                result = A + B; // Penjumlahan
                break;
            case '-':
                result = A - B; // Pengurangan
                break;
            case '*':
                result = A * B; // Perkalian
                break;
            case '/':
                result = A / B; // Pembagian
                break;
            case '%':
                result = A % B; // Sisa hasil bagi (modulus)
                break;
            default:
                System.out.println("Operator tidak valid"); // Jika operator tidak valid
                return; // Keluar dari program
        }

        System.out.println(result); // Mencetak hasil operasi

        input.close(); // Menutup scanner
    }
}
