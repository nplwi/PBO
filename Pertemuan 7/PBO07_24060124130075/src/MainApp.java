/* Nama File    : MainApp.java
 * Deskripsi    : Program utama untuk menjalankan semua bagian dari pertemuan 7, termasuk AdHocCoersion, Mahasiswa, Anabul, dan Seminar
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 21-04-2026
 */

public class MainApp {
    public static void main(String[] args) {
        
        // I. COERSION
        AdHocCoersion.jalankan();

        // II. OVERLOADING
        System.out.println("\n--- Bagian II: Polimorfisme Ad Hoc Overloading ---");
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("22001", "Budi", "Informatika");
        Mahasiswa m3 = new Mahasiswa(m2);
        m1.setProgramStudi();
        m3.setProgramStudi("Sistem Informasi");
        m1.tampilData(); m2.tampilData(); m3.tampilData();

        // III. ANABUL
        System.out.println("\n--- Bagian III: Universal Inclusion (Anabul) ---");
        Anabul[] pets = { new Kucing("Mio"), new Anjing("Rex"), new Burung("Pipit") };
        for (Anabul p : pets) {
            p.Gerak(); p.Bersuara();
        }

        // IV. SEMINAR
        System.out.println("\n--- Bagian IV: Universal Inclusion (Seminar) ---");
        Dosen d1 = new Dosen("D001", "Dr. Agus");
        Dosen d2 = new Dosen("D002", "Ir. Siska");
        MahasiswaCivitas mc1 = new MahasiswaCivitas("M001", "Ani");
        MahasiswaCivitas mc2 = new MahasiswaCivitas("M002", "Budi");
        MahasiswaCivitas mc3 = new MahasiswaCivitas("M003", "Caca");
        MahasiswaCivitas mc4 = new MahasiswaCivitas("M004", "Deni");
        MahasiswaCivitas mc5 = new MahasiswaCivitas("M005", "Eka");

        mc1.setWali(d1); // Set Wali
        
        Seminar sem = new Seminar();
        sem.registrasi(d1); sem.registrasi(d2);
        sem.registrasi(mc1); sem.registrasi(mc2); sem.registrasi(mc3); sem.registrasi(mc4); sem.registrasi(mc5);

        System.out.println("Banyak Peserta: " + sem.countPeserta());
        System.out.println("Banyak Mahasiswa: " + sem.countMahasiswa());
        sem.tampilPeserta();
        System.out.println("Data Spesifik Mahasiswa:");
        mc1.tampilDataMahasiswa();
    }
}

/* 
Cara kerja polimorfisme
1. Ad Hoc Coersion/Overloading: nama fungsinya sama, tapi isinya (parameternya) beda.
2. Universal Inclusion: objek dari kelas turunan bisa dipakai di kelas induknya.
3. coersion: mengubah tipe data ke tipe lain (misal int ke char).
 */