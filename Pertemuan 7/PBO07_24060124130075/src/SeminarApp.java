/* Nama File    : SeminarApp.java
 * Deskripsi    : Program untuk mengilustrasikan konsep polimorfisme dengan kelas Civitasakademika, Dosen, MahasiswaCivitas, dan Seminar
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 21-04-2026
 */

abstract class Civitasakademika {
    protected String Nama;
    public Civitasakademika(String nama) { this.Nama = nama; }
    public abstract String getNomor();
}

class Dosen extends Civitasakademika {
    private String NIP;
    public Dosen(String nip, String nama) { super(nama); this.NIP = nip; }
    @Override public String getNomor() { return NIP; }
    public String getNama() { return Nama; }
}

class MahasiswaCivitas extends Civitasakademika {
    private String NIM;
    private Dosen dosenwali;
    public MahasiswaCivitas(String nim, String nama) { super(nama); this.NIM = nim; }
    public void setWali(Dosen d) { this.dosenwali = d; } // 4i
    @Override public String getNomor() { return NIM; }
    public void tampilDataMahasiswa() { // 4j
        String wali = (dosenwali != null) ? dosenwali.getNama() : "Belum ada";
        System.out.println("NIM: " + NIM + ", Mhs: " + Nama + ", Wali: " + wali);
    }
}

class Seminar {
    private Civitasakademika[] pesertas = new Civitasakademika[100]; // 4b
    private int banyakpeserta;

    public Seminar() { this.banyakpeserta = 0; }
    public void registrasi(Civitasakademika c) { // 4d
        if (banyakpeserta < 100) pesertas[banyakpeserta++] = c;
    }
    public int countPeserta() { return banyakpeserta; } // 4c
    public int countMahasiswa() { // 4h (instanceof)
        int c = 0;
        for(int i=0; i<banyakpeserta; i++) if(pesertas[i] instanceof MahasiswaCivitas) c++;
        return c;
    }
    public void tampilPeserta() { // 4g
        System.out.println("Daftar Peserta Seminar:");
        for(int i=0; i<banyakpeserta; i++) {
            System.out.println((i+1) + ". [" + pesertas[i].getNomor() + "] " + pesertas[i].Nama);
        }
    }
}