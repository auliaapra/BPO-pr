package S2;

public class Square extends Rectangle {

    // Konstruktor default
    public Square() {
        super();
    }

    // Konstruktor dengan parameter sisi
    public Square(double side) {
        super(side, side);
    }

    // Konstruktor dengan parameter sisi, warna, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter untuk sisi persegi
    public double getSide() {
        return getWidth();
    }

    // Setter untuk sisi persegi
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setter untuk lebar dan panjang agar sisi tetap sama
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override metode toString untuk memberikan deskripsi objek Square
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
