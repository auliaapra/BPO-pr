package S2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // Konstruktor default, lebar dan panjang diatur ke 1.0
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Konstruktor dengan parameter lebar dan panjang
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Konstruktor dengan parameter lebar, panjang, warna, dan filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter dan setter untuk lebar dan panjang
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Menghitung luas persegi panjang
    public double getArea() {
        return width * length;
    }

    // Menghitung keliling persegi panjang
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString untuk memberikan deskripsi objek Rectangle
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
