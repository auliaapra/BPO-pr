// Kelas utama untuk menguji Cylinder
public class TestCylinder {
        public static void main(String[] args) {
            // Membuat dan mengalokasikan instance baru dari Cylinder dengan warna, radius, dan tinggi default
            Cylinder c1 = new Cylinder();
            System.out.println(c1); // Uji method toString()
            System.out.println(" radius=" + c1.getRadius()
                    + " height=" + c1.getHeight()
                    + " base area=" + c1.getArea()   // Menghitung luas permukaan
                    + " volume=" + c1.getVolume());  // Menghitung volume
    
            // Membuat dan mengalokasikan instance baru dari Cylinder dengan tinggi tertentu, warna dan radius default
            Cylinder c2 = new Cylinder(10.0);
            System.out.println(c2); // Uji method toString()
            System.out.println(" radius=" + c2.getRadius()
                    + " height=" + c2.getHeight()
                    + " base area=" + c2.getArea()   // Menghitung luas permukaan
                    + " volume=" + c2.getVolume());  // Menghitung volume
    
            // Membuat dan mengalokasikan instance baru dari Cylinder dengan radius dan tinggi yang ditentukan
            Cylinder c3 = new Cylinder(2.0, 10.0);
            System.out.println(c3); // Uji method toString()
            System.out.println(" radius=" + c3.getRadius()
                    + " height=" + c3.getHeight()
                    + " base area=" + c3.getArea()   // Menghitung luas permukaan
                    + " volume=" + c3.getVolume());  // Menghitung volume
        }
    }
    