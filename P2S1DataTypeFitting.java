// Aulia Putri Ramadhani
// Data Type Fitting

import java.util.Scanner;

public class P2S1DataTypeFitting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Berapa angka yang ingin dimasukkan? ");
        int jumlahAngka = scan.nextInt(); 
        scan.nextLine();

        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan Angka = ");
            String input = scan.nextLine();

            try {
                long number = Long.parseLong(input);

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println(input + " can be fitted in:\n * byte\n * short\n * int\n * long");
                } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println(input + " can be fitted in:\n * short\n * int\n * long");
                } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println(input + " can be fitted in:\n * int\n * long");
                } else if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println(input + " can be fitted in:\n * long");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        scan.close();
    }
}
