package S3.Case1; // Mendeklarasikan package untuk class Sortable

// Kelas abstrak Sortable
abstract class Sortable {
    // Method abstrak untuk membandingkan dua objek Sortable
    public abstract int compare(Sortable b);
    
    // Metode statis shell_sort untuk mengurutkan array objek Sortable
    public static void shell_sort(Sortable[] a) {
        int n = a.length; // Panjang array

        // Memulai dengan gap setengah dari panjang array
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Loop untuk mengurutkan elemen berdasarkan gap
            for (int i = gap; i < n; i += 1) {
                Sortable temp = a[i]; // Menyimpan elemen saat ini di temp

                int j;
                // Memindahkan elemen yang lebih besar dari temp ke depan
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap]; // Geser elemen
                }

                a[j] = temp; // Menempatkan elemen di posisi yang benar
            }
        }
    }
}
