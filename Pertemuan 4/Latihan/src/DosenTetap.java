import java.time.Period;

class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period mk = getMasaKerja();
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tglLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTglPensiun(BUP)));
        System.out.printf("Gaji Pokok      : Rp %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan       : 2%% x %d x Rp %,.2f = Rp %,.2f\n", 
                          mk.getYears(), gajiPokok, getTunjangan());
    }
}
