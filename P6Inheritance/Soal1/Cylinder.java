public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea() * height;  // Use the base area from Circle's getArea()
    }
    
    public double getBaseArea() {
        return super.getArea();  // call Circle's getArea()
    }

    // Override the getArea() method to compute the surface area of the cylinder
    @Override
    public double getArea() {
        // Surface area = 2πrh + 2πr^2
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea(); 
    }

    // Override toString method
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
