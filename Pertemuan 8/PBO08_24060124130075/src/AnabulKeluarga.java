/* Nama File    : AnabulKeluarga.java
 * Deskripsi    : Program untuk mengilustrasikan konsep pewarisan dengan kelas Anabul sebagai kelas induk dan Kucing, Anggora, Kembangtelon sebagai kelas turunannya
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 28-04-2026
 */

class Anabul {
    protected String nama;
    public Anabul(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    @Override public String toString() { return "Anabul: " + nama; }
}

class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    public double getBobot() { return bobot; }
    @Override public String toString() { return "Kucing: " + nama + " (" + bobot + "kg)"; }
}

class Anggora extends Kucing {
    public Anggora(String nama, double bobot) { super(nama, bobot); }
}

class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) { super(nama, bobot); }
}