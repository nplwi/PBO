/* Nama File    : Petani.java
 * Deskripsi    : Berisi atribut dan method dalam class Petani
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(6));
        int C = 0; // GANTI dengan digit ke-12 NIM kamu
        return (2026 - tahunMulai) + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani pajaknya 0 sesuai tabel
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}