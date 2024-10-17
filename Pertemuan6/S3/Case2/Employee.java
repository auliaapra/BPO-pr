package P6.S3.Case2;

public class Employee implements Sortable {
    // Mendefinisikan atribut privat untuk nama, gaji, dan tanggal perekrutan
    private String name;
    private double salary;
    private int hireday, hiremonth, hireyear;

    // Konstruktor untuk menginisialisasi atribut
    public Employee(String n, double s, int day, int month, int year) {
        name = n;      // Inisialisasi nama
        salary = s;    // Inisialisasi gaji
        hireday = day; // Inisialisasi hari perekrutan
        hiremonth = month; // Inisialisasi bulan perekrutan
        hireyear = year;   // Inisialisasi tahun perekrutan
    }

    // Metode untuk mencetak detail karyawan
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear()); // Mencetak nama, gaji, dan tahun perekrutan
    }

    // Metode untuk menaikkan gaji dengan persentase tertentu
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100; // Menambah gaji berdasarkan persentase
    }

    // Metode untuk mendapatkan tahun perekrutan
    public int hireYear() {
        return hireyear; // Mengembalikan tahun perekrutan
    }

    // Implementasi metode `compare` dari interface `Sortable`
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b; // Melakukan casting objek `Sortable` menjadi `Employee`
        if (salary < eb.salary) return -1; // Mengembalikan -1 jika gaji lebih kecil
        if (salary > eb.salary) return 1;  // Mengembalikan 1 jika gaji lebih besar
        return 0;  // Mengembalikan 0 jika gaji sama
    }
}
