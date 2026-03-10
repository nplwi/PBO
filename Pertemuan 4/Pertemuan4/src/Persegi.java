/* Nama File    : Persegi.java
 * Deskripsi    : Berisi atribut dan method dalam class Persegi
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 10-03-2026
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
        this.setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi       : " + sisi);
        System.out.println("Luas       : " + getLuas());
        System.out.println("Keliling   : " + getKeliling());
    }
}
