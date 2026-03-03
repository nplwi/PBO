/* Nama File    : MMahasiswa.java
 * Deskripsi    : Driver untuk menguji class Mahasiswa
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 03-03-2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Pembuatan objek dari masing-masing kelas
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah GTI = new MataKuliah("GTI", "Grafik dan Teknik Interaktif", 3);
        MataKuliah JARKOM = new MataKuliah("JARKOM", "Jaringan Komputer", 3);
        
        Mahasiswa M1 = new Mahasiswa("24060124130075", "Naufal Dwi Yusmawan", "Informatika");
        Dosen D1 = new Dosen("123456789", "Andi Surandi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");

        // Merelasikan objek
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.addMatKul(GTI);
        M1.addMatKul(JARKOM);

        // Memanggil method untuk cetak detail dan hitung jumlah
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}