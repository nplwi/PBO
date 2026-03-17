/* Nama File    : Lingkaram.java
 * Deskripsi    : Berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    @Override
    public double getLuas() { return Math.PI * jari * jari; }

    @Override
    public double getKeliling() { return 2 * Math.PI * jari; }

    // Implementasi IResize
    @Override
    public void zoomIn() { this.jari *= 1.1; }

    @Override
    public void zoomOut() { this.jari *= 0.9; }

    @Override
    public void zoom(int percent) { this.jari = this.jari * percent / 100; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.printf("Luas: %.2f\n", getLuas());
    }
}