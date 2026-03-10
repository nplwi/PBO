/* Nama File    : MBangunDatar.java
 * Deskripsi    : Driver untuk menguji class Persegi dan Lingkaran
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 10-03-2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        // 1. Membuat Persegi
        Persegi kotak = new Persegi(5.0, "Merah", "Solid");
        
        System.out.println(" Data Persegi ");
        kotak.printInfo();
        System.out.println("Sisi     : " + kotak.getSisi());
        System.out.println("Luas     : " + kotak.getLuas());
        System.out.println("Keliling : " + kotak.getKeliling());
        System.out.printf("Diagonal : %.2f\n", kotak.getDiagonal());
        
        System.out.println();

        // 2. Membuat Lingkaran
        Lingkaran bulat = new Lingkaran(14.0, "Biru", "Dashed");

        System.out.println("--- Data Lingkaran ---");
        bulat.printInfo();
        System.out.println("Jari-jari: " + bulat.getJari());
        System.out.printf("Luas     : %.2f\n", bulat.getLuas());
        System.out.printf("Keliling : %.2f\n", bulat.getKeliling());
        
    }
}