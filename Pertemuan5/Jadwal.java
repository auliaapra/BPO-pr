public class Jadwal {
    private String hari;
    private int jamKe;
    private String waktu;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private Ruangan ruangan;

    public Jadwal(String hari, int jamKe, String waktu, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan) {
        this.hari = hari;
        this.jamKe = jamKe;
        this.waktu = waktu;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }

    @Override
    public String toString() {
        return hari + ", Jam ke-" + jamKe + " (" + waktu + "), " +
               mataKuliah + ", Dosen: " + dosen.nama + ", Ruangan: " + ruangan;
    }
}