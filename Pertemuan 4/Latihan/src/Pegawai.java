import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, String tglLahir, String tmt, double gajiPokok) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir, formatter);
        this.tmt = LocalDate.parse(tmt, formatter);
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter indoFormat = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(indoFormat);
    }

    protected Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    protected LocalDate hitungTglPensiun(int bup) {
        return tglLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    public abstract void printInfo();
}