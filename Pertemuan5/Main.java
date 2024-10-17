import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize data
        List<Mahasiswa> mahasiswaList = initializeMahasiswaData();
        List<Dosen> dosenList = initializeDosenData();
        List<Jadwal> jadwalList = initializeJadwalData(dosenList);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║                                  ║");
            System.out.println("║      AULIA PUTRI RAMADHANI       ║");
            System.out.println("║            (231511070)           ║");
            System.out.println("║                                  ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println();
            System.out.println("+----------------------------------+");
            System.out.println("|               MENU               |");
            System.out.println("+----------------------------------+");
            System.out.println("| 1. Tampilkan Data Mahasiswa      |");
            System.out.println("| 2. Tampilkan Data Dosen          |");
            System.out.println("| 3. Tampilkan Jadwal Perkuliahan  |");
            System.out.println("| 0. Keluar                        |");
            System.out.println("+----------------------------------+");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tampilkanDataMahasiswa(mahasiswaList);
                    break;
                case 2:
                    tampilkanDataDosen(dosenList);
                    break;
                case 3:
                    tampilkanJadwalPerkuliahan(jadwalList);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void tampilkanDataMahasiswa(List<Mahasiswa> mahasiswaList) {
        System.out.println("\nData Mahasiswa:");
        System.out.println();
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
            System.out.println();
        }
    }

    private static void tampilkanDataDosen(List<Dosen> dosenList) {
        System.out.println("\nData Dosen:");
        System.out.println();
        for (Dosen dosen : dosenList) {
            System.out.println(dosen);
            System.out.println();
        }
    }

    private static void tampilkanJadwalPerkuliahan(List<Jadwal> jadwalList) {
        System.out.println("\nJadwal Perkuliahan:");
        System.out.println();
        for (Jadwal jadwal : jadwalList) {
            System.out.println(jadwal);
            System.out.println();
        }
    }

    private static List<Mahasiswa> initializeMahasiswaData() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Agra Anisa Ibtisamah", "agra.anisa.tif23@polban.ac.id", "231511067",
                "Bandung, 4 Juni 2004", "08987092212", "Biro Komunikasi dan Informasi"));
        mahasiswaList.add(new Mahasiswa("Aulia Putri Ramadhani", "aulia.putri.tif23@polban.ac.id", "231511070",
                "Garut, 6 November 2004", "081319952725", "Biro Administrasi dan Kesekretariatan"));
        mahasiswaList.add(new Mahasiswa("Berliana Novianti", "berliana.novianti.tif23@polban.ac.id", "231511072",
                "Bandung, 21 November 2005", "085722891404", "Departemen Pengembangan Sumber Daya Anggota"));
        mahasiswaList.add(new Mahasiswa("Elsa Monika Sinaga", "elsa.monika.tif23@polban.ac.id", "231511074",
                "Bandung, 02 April 2005", "083187661914", "Biro Komunikasi dan Informasi"));
        mahasiswaList.add(new Mahasiswa("Isyana Putri Indriana", "isyana.putri.tif23@polban.ac.id", "231511078",
                "Cirebon, 21 Maret 2005", "08815215133", "Biro Keuangan"));
        mahasiswaList.add(new Mahasiswa("Jihan Humaira", "jihan.humaira.tif23@polban.ac.id", "231511079",
                "Bandung, 26 Desember 2004", "087861765322", "Departemen Luar Himpunan"));
        mahasiswaList.add(new Mahasiswa("Melly Dwiliani", "melly.dwiliani.tif23@polban.ac.id", "231511080",
                "Bandung, 02 Mei 2005", "089680128171", "Departemen Luar Himpunan"));
        mahasiswaList.add(new Mahasiswa("Sifa Wafiqna", "sifa.wafiqna.tif23@pilban.ac.id", "231511092",
                "Tasikmalaya, 25 Februari 2005", "081646976710", "Biro Keuangan"));
        mahasiswaList.add(new Mahasiswa("Syahla Salsabila", "syahla.salsabila.tif23@polban.ac.id", "231511095",
                "Cimahi, 28 Maret 2005", "083821417252", "Biro Komunikasi dan Informasi"));
        mahasiswaList.add(new Mahasiswa("Yulina Anggraeni", "yulina.anggraeni.tif23@polban.ac.id", "231511096",
                "Tegal, 12 Juli 2005", "088227573318", "Majelis Perwakilan Anggota (MPA)"));
        return mahasiswaList;
    }

    private static List<Dosen> initializeDosenData() {
        List<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Ade Chandra Nugraha, S.Si., M.T.", "chandra@jtk.polban.ac.id", "197312271999031000"));
        dosenList.add(new Dosen("Irawan Thamrin, IR., M.T.", "irawan@jtk.polban.ac.id", "196208151990031000"));
        dosenList.add(new Dosen("Santi Sundari, S.Si., M.T.", "santi@jtk.polban.ac.id", "197109031999032000"));
        dosenList.add(new Dosen("Yudi Widhiyasana, S.Si., M.T.", "goezthel@jtk.polban.ac.id", "197407182001121000"));
        dosenList.add(new Dosen("Suprihanto, BSEE., M.Sc.", "sprh@jtk.polban.ac.id", "196303161995121000"));
        dosenList.add(new Dosen("Irwan Setiawan, S.Si., M.T.", "irwan@jtk.polban.ac.id", "198004192005011000"));
        dosenList.add(new Dosen("Yadhi Adhitia Permana, S.T., M.Kom", "yadhi@jtk.polban.ac.id", "197912242008121000"));
        dosenList.add(
                new Dosen("Zulkifli Arsyad, S.Kom., M.T. ", "zulkifli.arsyad@jtk.polban.ac.id", "198801292015041003"));
        dosenList.add(new Dosen("Ade Hodijah, S.Kom., M.T.", "adehodijah@jtk.polban.ac.id", "198502102015042000"));
        dosenList.add(new Dosen("Muhammad Rizqi Sholahuddin, S.Si., M.T.", "muhammad.rizqi@jtk.polban.ac.id",
                "199105302019031000"));
        dosenList.add(new Dosen("Trisna Gelar Abdillah, S.T., M.Kom.", "trisna.gelar@jtk.polban.ac.id",
                "198608202019031000"));

        return dosenList;
    }

    private static List<Jadwal> initializeJadwalData(List<Dosen> dosenList) {
        List<Jadwal> jadwalList = new ArrayList<>();

        // Objek MataKuliah
        MataKuliah pbopr = new MataKuliah("Pemrograman Berorientasi Objek", "Praktikum");
        MataKuliah pbo = new MataKuliah("Pemrograman Berorientasi Objek", "Teori");
        MataKuliah kompGrafikpr = new MataKuliah("Komputer Grafik", "Praktikum");
        MataKuliah kompGrafik = new MataKuliah("Komputer Grafik", "Teori");
        MataKuliah matDiskrit = new MataKuliah("Matematika Diskrit II", "Teori");
        MataKuliah basisDatapr = new MataKuliah("Basis Data", "Praktikum");
        MataKuliah basisData = new MataKuliah("Basis Data", "Teori");
        MataKuliah aljabarLinear = new MataKuliah("Aljabar Linear", "Teori");
        MataKuliah pengantarRPLpr = new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "Praktikum");
        MataKuliah pengantarRPL = new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "Teori");
        MataKuliah proyek3pr = new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web", "Praktikum");
        MataKuliah proyek3 = new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web", "Teori");

        // Objek Ruangan
        Ruangan d217 = new Ruangan("D217");
        Ruangan d102 = new Ruangan("D102 - Lab. MT");
        Ruangan d101 = new Ruangan("D101");
        Ruangan d106 = new Ruangan("D106 - Lab. SDB");

        // Senin
        jadwalList.add(new Jadwal("Senin", 3, "08.40-09.30", pbo, dosenList.get(6), d217));
        jadwalList.add(new Jadwal("Senin", 4, "09.50-10.40", pbo, dosenList.get(6), d217));
        jadwalList.add(new Jadwal("Senin", 5, "10.40-11.30", kompGrafik, dosenList.get(3), d217));
        jadwalList.add(new Jadwal("Senin", 6, "11.30-12.20", kompGrafik, dosenList.get(3), d217));
        jadwalList.add(new Jadwal("Senin", 7, "13.00-13.50", matDiskrit, dosenList.get(4), d217));
        jadwalList.add(new Jadwal("Senin", 8, "13.50-14.40", matDiskrit, dosenList.get(4), d217));
        jadwalList.add(new Jadwal("Senin", 9, "14.40-15.30", matDiskrit, dosenList.get(4), d217));
        jadwalList.add(new Jadwal("Senin", 10, "15.50-16.40", kompGrafikpr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Senin", 11, "16.40-17.30", kompGrafikpr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Senin", 12, "17.30-18.20", kompGrafikpr, dosenList.get(10), d102));

        // Selasa
        jadwalList.add(new Jadwal("Selasa", 1, "07.00-07.50", basisData, dosenList.get(0), d101));
        jadwalList.add(new Jadwal("Selasa", 2, "07.50-08.40", basisData, dosenList.get(0), d101));
        jadwalList.add(new Jadwal("Selasa", 3, "08.40-09.30", aljabarLinear, dosenList.get(9), d101));
        jadwalList.add(new Jadwal("Selasa", 4, "09.50-10.40", aljabarLinear, dosenList.get(9), d101));
        jadwalList.add(new Jadwal("Selasa", 5, "10.40-11.30", pengantarRPL, dosenList.get(2), d101));
        jadwalList.add(new Jadwal("Selasa", 6, "11.30-12.20", pengantarRPL, dosenList.get(2), d101));

        // Rabu
        jadwalList.add(new Jadwal("Rabu", 1, "07.00-07.50", proyek3, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Rabu", 2, "07.50-08.40", proyek3pr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Rabu", 3, "08.40-09.30", proyek3pr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Rabu", 7, "13.00-13.50", proyek3pr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Rabu", 8, "13.50-14.40", proyek3pr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Rabu", 9, "14.40-15.30", proyek3pr, dosenList.get(10), d102));
        jadwalList.add(new Jadwal("Rabu", 10, "15.50-16.40", proyek3pr, dosenList.get(10), d102));

        // Kamis
        jadwalList.add(new Jadwal("Kamis", 4, "09.50-10.40", pengantarRPLpr, dosenList.get(6), d106));
        jadwalList.add(new Jadwal("Kamis", 5, "10.40-11.30", pengantarRPLpr, dosenList.get(6), d106));
        jadwalList.add(new Jadwal("Kamis", 6, "11.30-12.20", pengantarRPLpr, dosenList.get(6), d106));
        jadwalList.add(new Jadwal("Kamis", 10, "15.50-16.40", pbopr, dosenList.get(7), d106));
        jadwalList.add(new Jadwal("Kamis", 11, "16.40-17.30", pbopr, dosenList.get(7), d106));
        jadwalList.add(new Jadwal("Kamis", 12, "17.30-18.20", pbopr, dosenList.get(7), d106));

        // Jumat
        jadwalList.add(new Jadwal("Jumat", 2, "07.50-08.40", basisDatapr, dosenList.get(0), d106));
        jadwalList.add(new Jadwal("Jumat", 3, "08.40-09.30", basisDatapr, dosenList.get(0), d106));
        jadwalList.add(new Jadwal("Jumat", 4, "09.50-10.40", basisDatapr, dosenList.get(0), d106));

        return jadwalList;
    }
}