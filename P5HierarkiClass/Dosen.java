public class Dosen extends Person {
    private String nip;

    public Dosen(String nama, String email, String nip) {
        super(nama, email);
        this.nip = nip;
    }

    @Override
    public String toString() {
        return super.toString() + ", NIP: " + nip;
    }
}