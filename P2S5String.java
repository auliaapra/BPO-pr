// Aulia Putri Ramadhani
// String Declarations

import java.util.Scanner;

public class P2S5String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String A = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String B = scanner.nextLine();

        int totalLength = A.length() + B.length();
        System.out.println("Total Length: " + totalLength);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes, '" + A + "' is lexicographically greater than '" + B + "'.");
        } else {
            System.out.println("No, '" + A + "' is not lexicographically greater than '" + B + "'.");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
