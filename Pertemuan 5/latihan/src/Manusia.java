/* Nama File    : Manusia.java
 * Deskripsi    : Berisi atribut dan method dalam class Manusia
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public abstract class Manusia {
    protected String nama;
    protected String tgl_mulai_kerja; // Format: dd-mm-yyyy
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() { return counterMns; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}