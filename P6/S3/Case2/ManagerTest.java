package P6.S3.Case2;

public class ManagerTest {
    public static void main(String[] args) {
        // Inisialisasi array dari objek `Sortable` yang berisi `Employee` dan `Manager`
        Sortable[] staff = new Sortable[3];
        staff[0] = new Employee("Antonio Rossi", 3500000, 1, 10, 1989); // Inisialisasi objek Employee
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);  // Inisialisasi objek Manager
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);  // Inisialisasi objek Employee

        // Mencetak staff sebelum diurutkan
        System.out.println("Before sorting:");
        printStaff(staff);

        // Memanggil metode `shell_sort` untuk mengurutkan staff berdasarkan gaji
        Sortable.shell_sort(staff);

        // Mencetak staff setelah diurutkan
        System.out.println("\nAfter sorting:");
        printStaff(staff);
    }

    // Metode untuk mencetak setiap objek `Employee` dalam array staff
    private static void printStaff(Sortable[] staff) {
        for (Sortable e : staff) {
            ((Employee) e).print(); // Melakukan casting objek `Sortable` menjadi `Employee` untuk memanggil `print()`
        }
    }
}
