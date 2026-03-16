import java.time.Period;

class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        Period mk = getMasaKerja();
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTglPensiun(BUP)));
        System.out.printf("Tunjangan       : 1%% x %d x Gaji Pokok = Rp %,.2f\n", 
                          mk.getYears(), (0.01 * mk.getYears() * gajiPokok));
    }
}