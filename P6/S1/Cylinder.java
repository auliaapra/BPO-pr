// Kelas Cylinder untuk merepresentasikan silinder, turunan dari Circle
public class Cylinder extends Circle {
    // Variabel instance private untuk tinggi
    private double height;

    // Konstruktor dengan nilai default untuk warna, radius, dan tinggi
    public Cylinder() {
        super(); // Memanggil konstruktor Circle tanpa argumen
        height = 1.0; // Default tinggi
    }

    // Konstruktor dengan radius default dan tinggi yang ditentukan
    public Cylinder(double height) {
        super(); // Memanggil konstruktor Circle tanpa argumen
        this.height = height; // Set tinggi yang ditentukan
    }

    // Konstruktor dengan radius dan tinggi yang ditentukan
    public Cylinder(double radius, double height) {
        super(radius); // Memanggil konstruktor Circle dengan radius
        this.height = height; // Set tinggi yang ditentukan
    }

    // Method publik untuk mendapatkan nilai tinggi
    public double getHeight() {
        return height; // Mengembalikan tinggi silinder
    }

    // Method publik untuk menghitung volume silinder
    // Menggunakan method getArea() dari superclass (Circle) untuk mendapatkan luas alas
    public double getVolume() {
        return super.getArea() * height; // Volume = luas alas * tinggi
    }

    // Method untuk mendapatkan luas alas (memanggil getArea dari Circle)
    public double getBaseArea() {
        return super.getArea(); // Mengembalikan luas alas dari Circle
    }

    // Override method getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        // Luas permukaan = 2πrh + 2πr^2
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Override method toString untuk deskripsi instance Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() // Memanggil toString() dari Circle
                + " height=" + height;
    }
}
