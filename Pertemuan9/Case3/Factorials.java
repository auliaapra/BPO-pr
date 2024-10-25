import java.util.Scanner;

public class Factorials extends RuntimeException{
    public static void main (String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.println();
            System.out.print("Masukkan sebuah bilangan: ");
            int val = scan.nextInt();

            try {
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            System.out.print("\nIngin menghitung faktorial lain? (y/n) ");
            keepGoing = scan.next();
        }
        scan.close();
    }
}