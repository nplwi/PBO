/* Nama File    : Persegi.java
 * Deskripsi    : Berisi atribut dan method dalam class Persegi
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    @Override
    public double getLuas() { return sisi * sisi; }

    @Override
    public double getKeliling() { return 4 * sisi; }

    // Implementasi IResize
    @Override
    public void zoomIn() { this.sisi *= 1.1; }

    @Override
    public void zoomOut() { this.sisi *= 0.9; }

    @Override
    public void zoom(int percent) { this.sisi = this.sisi * percent / 100; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
    }
}