public class Mahasiswa extends Person {
    private String nim;
    private String tempatTanggalLahir;
    private String nomorTelepon;
    private String dbu;

    public Mahasiswa(String nama, String email, String nim, String tempatTanggalLahir, String nomorTelepon, String dbu) {
        super(nama, email);
        this.nim = nim;
        this.tempatTanggalLahir = tempatTanggalLahir;
        this.nomorTelepon = nomorTelepon;
        this.dbu = dbu;
    }

    @Override
    public String toString() {
        return super.toString() + ", NIM: " + nim + ", TTL: " + tempatTanggalLahir +
               ", No. Telp: " + nomorTelepon + ", DBU: " + dbu;
    }
}