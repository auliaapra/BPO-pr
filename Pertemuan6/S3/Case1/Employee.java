package S3.Case1; // Mendeklarasikan package untuk class Employee

// Kelas Employee merupakan turunan dari Sortable
class Employee extends Sortable {
    // Deklarasi atribut private untuk Employee
    private String name;        // Nama karyawan
    private double salary;      // Gaji karyawan
    private int hireday;        // Hari mulai bekerja
    private int hiremonth;      // Bulan mulai bekerja
    private int hireyear;       // Tahun mulai bekerja

    // Konstruktor Employee, menginisialisasi atribut
    public Employee(String n, double s, int day, int month, int year) {
        name = n;             // Inisialisasi nama
        salary = s;           // Inisialisasi gaji
        hireday = day;        // Inisialisasi hari mulai bekerja
        hiremonth = month;    // Inisialisasi bulan mulai bekerja
        hireyear = year;      // Inisialisasi tahun mulai bekerja
    }

    // Method untuk mencetak data karyawan
    public void print() {
        // Mencetak nama, gaji, dan tahun mulai bekerja
        System.out.println(name + " " + salary + " " + hireYear());
    }

    // Method untuk menaikkan gaji berdasarkan persentase
    public void raiseSalary(double byPercent) {
        // Menaikkan gaji sesuai dengan persentase yang diberikan
        salary *= 1 + byPercent / 100;
    }

    // Method untuk mengembalikan nilai hireyear (tahun mulai bekerja)
    public int hireYear() {
        return hireyear;
    }

    // Implementasi method compare dari Sortable untuk membandingkan gaji
    @Override
    public int compare(Sortable b) {
        // Melakukan casting objek Sortable ke tipe Employee
        Employee eb = (Employee) b;

        // Membandingkan gaji, mengembalikan -1, 0, atau 1
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return +1;
        return 0;
    }
}
