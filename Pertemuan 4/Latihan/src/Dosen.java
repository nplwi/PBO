public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {}

    public String getNama() {
        throw new UnsupportedOperationException("Unimplemented method 'getNama'");
    }
}