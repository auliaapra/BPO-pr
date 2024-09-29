package P6.S3.Case2;

public interface Sortable {
    // Metode abstrak untuk membandingkan dua objek
    int compare(Sortable b);

    // Metode statis untuk melakukan pengurutan menggunakan algoritma Shell Sort
    static void shell_sort(Sortable[] a) {
        int n = a.length; // Mendapatkan panjang array
        for (int gap = n / 2; gap > 0; gap /= 2) { // Pengaturan jarak (gap) awal
            for (int i = gap; i < n; i++) {        // Iterasi melalui array
                Sortable temp = a[i];  // Menyimpan elemen sementara
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap]; // Memindahkan elemen jika lebih besar
                }
                a[j] = temp; // Memasukkan elemen pada posisi yang sesuai
            }
        }
    }
}
