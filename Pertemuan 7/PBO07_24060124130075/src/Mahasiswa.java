/* Nama File    : Mahasiswa.java
 * Deskripsi    : Program untuk menguji konsep overloading dan constructor kloning pada kelas Mahasiswa
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 21-04-2026
 */

public class Mahasiswa {
    private String NIM, Nama, Programstudi;

    // 2c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999"; this.Nama = "n/a"; this.Programstudi = "n/a";
    }

    // 2d. Konstruktor 3 parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim; this.Nama = nama; this.Programstudi = prodi;
    }

    // 2e. Konstruktor kloning
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM; this.Nama = m.Nama; this.Programstudi = m.Programstudi;
    }

    // 2a. Overloading setProgramStudi
    public void setProgramStudi() { this.Programstudi = "Kosong"; }
    public void setProgramStudi(String prodi) { this.Programstudi = prodi; }
    public void setProgramStudi(Mahasiswa m) { this.Programstudi = m.Programstudi; }

    public void tampilData() {
        System.out.println("NIM: " + NIM + ", Nama: " + Nama + ", Prodi: " + Programstudi);
    }
}