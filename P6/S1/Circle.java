// Kelas Circle untuk merepresentasikan lingkaran
public class Circle {
    // Variabel instance private, tidak bisa diakses dari luar kelas
    private double radius;
    private String color;

    // Konstruktor (overloading)
    // Membuat instance Circle dengan nilai default untuk radius dan warna
    public Circle() {
        radius = 1.0; // Default radius
        color = "red"; // Default warna
    }

    // Membuat instance Circle dengan radius yang diberikan dan warna default
    public Circle(double r) {
        radius = r; // Radius ditentukan oleh pengguna
        color = "red"; // Default warna
    }

    // Membuat instance Circle dengan radius dan warna yang diberikan
    public Circle(double r, String c) {
        radius = r; // Radius ditentukan oleh pengguna
        color = c; // Warna ditentukan oleh pengguna
    }

    // Mengembalikan nilai radius
    public double getRadius() {
        return radius; // Mengembalikan radius
    }

    // Menetapkan nilai radius baru
    public void setRadius(double radius) {
        this.radius = radius; // Set radius baru
    }

    // Mengembalikan nilai warna
    public String getColor() {
        return color; // Mengembalikan warna lingkaran
    }

    // Menetapkan warna baru
    public void setColor(String color) {
        this.color = color; // Set warna baru
    }

    // Menghitung luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI; // Rumus luas lingkaran
    }

    // Mengembalikan string deskripsi dari instance Circle
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]"; // Deskripsi lingkaran
    }
}
