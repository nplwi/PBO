import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tglBerakhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas, String tglSelesai) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = LocalDate.parse(tglSelesai, DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    @Override
    public void printInfo() {
        Period sisaKontrak = Period.between(LocalDate.now(), tglBerakhirKontrak);
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Sisa Kontrak    : " + sisaKontrak.getMonths() + " bulan lagi");
        System.out.printf("Tunjangan       : 2.5%% x Gaji Pokok = Rp %,.2f\n", (0.025 * gajiPokok));
    }
}