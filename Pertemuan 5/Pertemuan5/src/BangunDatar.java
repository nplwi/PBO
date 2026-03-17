/* Nama File    : BangunDatar.java
 * Deskripsi    : Berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    public BangunDatar() {}

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public int getJmlSisi() { return jmlSisi; }
    public void setJmlSisi(int jmlSisi) { this.jmlSisi = jmlSisi; }
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }
    public String getBorder() { return border; }
    public void setBorder(String border) { this.border = border; }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}