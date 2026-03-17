/* Nama File    : PNS.java
 * Deskripsi    : Berisi atribut dan method dalam class PNS
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 17-03-2026
 */

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl, String alamat, double pendapatan, String nip) {
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(6));
        int A = 0; // GANTI dengan digit ke-14 NIM kamu
        return (2026 - tahunMulai) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}