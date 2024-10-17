package S3.Case1; // Package untuk file EmployeeTest

// Kelas utama untuk pengujian
public class EmployeeTest {
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat array staff yang terdiri dari 3 objek Employee
        Employee[] staff = new Employee[3];
        // Mengisi array dengan objek Employee
        staff[0] = new Employee("Antonio Rossi", 3500000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Mencetak sebelum proses pengurutan
        System.out.println("Before sorting:");
        for (Employee e : staff) {
            e.print(); // Memanggil method print() untuk setiap objek Employee
        }

        // Mengurutkan array staff berdasarkan gaji menggunakan metode shell_sort dari Sortable
        Sortable.shell_sort(staff);

        // Mencetak setelah proses pengurutan
        System.out.println("\nAfter sorting:");
        for (Employee e : staff) {
            e.print(); // Memanggil method print() untuk setiap objek Employee
        }
    }
}
