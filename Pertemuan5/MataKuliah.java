public class MataKuliah {
    private String namaMataKuliah;
    private String tipe;

    public MataKuliah(String namaMataKuliah, String tipe) {
        this.namaMataKuliah = namaMataKuliah;
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return namaMataKuliah + " (" + tipe + ")";
    }
}