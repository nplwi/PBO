/* Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 03-03-2026
 */

import java.util.ArrayList;

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter 
    public Dosen() {
    }

    // Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor (Getter) dan Mutator (Setter) 
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }
}