/* Nama File    : Pengusaha.java
 * Deskripsi    : Berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(6));
        int B = 0; // GANTI dengan digit ke-13 NIM kamu
        return (2026 - tahunMulai) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}