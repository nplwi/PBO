/* Nama File    : Lingkaram.java
 * Deskripsi    : Berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 10-03-2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super();
        this.setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari  : " + jari);
        System.out.printf("Luas       : %.2f\n", getLuas());
        System.out.printf("Keliling   : %.2f\n", getKeliling());
    }
}