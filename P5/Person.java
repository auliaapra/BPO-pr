public class Person {
    protected String nama;
    protected String email;

    public Person(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Email: " + email;
    }
}