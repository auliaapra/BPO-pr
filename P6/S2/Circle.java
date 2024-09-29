package S2;

public class Circle extends Shape {
    private double radius;

    // Konstruktor default, jari-jari diatur ke 1.0
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Konstruktor dengan parameter jari-jari
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Konstruktor dengan parameter radius, warna, dan filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter dan setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Menghitung luas lingkaran
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Menghitung keliling lingkaran
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString untuk memberikan deskripsi objek Circle
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
