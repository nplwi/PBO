/* Nama File    : Kendaraan.java
 * Deskripsi    : Berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 03-03-2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    // Konstruktor tanpa parameter 
    public Kendaraan() {
    }

    // Konstruktor dengan parameter 
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor dan Mutator 
    public String getNoPlat() { return noPlat; }
    public void setNoPlat(String noPlat) { this.noPlat = noPlat; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
}
