package P6.S3.Case2;

import java.util.Calendar;
import java.util.GregorianCalendar; 

public class Manager extends Employee {
    // Atribut privat untuk nama sekretaris
    private String secretaryName;

    // Konstruktor untuk menginisialisasi atribut Manager
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);  // Memanggil konstruktor kelas induk (Employee)
        secretaryName = "";    // Inisialisasi nama sekretaris
    }

    // Override metode `raiseSalary` untuk Manager
    public void raiseSalary(double byPercent) {
        GregorianCalendar todaysDate = new GregorianCalendar(); // Mendapatkan tanggal hari ini
        int currentYear = todaysDate.get(Calendar.YEAR); // Mendapatkan tahun saat ini
        double bonus = 0.5 * (currentYear - hireYear()); // Menghitung bonus berdasarkan lama bekerja
        super.raiseSalary(byPercent + bonus); // Menaikkan gaji dengan persentase ditambah bonus
    }

    // Metode untuk mendapatkan nama sekretaris
    public String getSecretaryName() {
        return secretaryName; // Mengembalikan nama sekretaris
    }
}
