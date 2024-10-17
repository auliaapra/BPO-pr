package S2;

public class Shape {
    private String color;
    private boolean filled;

    // Konstruktor default, mengatur warna ke hijau dan filled ke true
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Konstruktor dengan parameter warna dan filled
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter dan setter untuk atribut color dan filled
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Override metode toString untuk mengembalikan deskripsi objek
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
