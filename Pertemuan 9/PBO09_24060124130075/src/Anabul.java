/* 
 * NIM             : Naufal Dwi Yusmawan
 * Deskripsi       : Kelas Anabul sebagai kelas induk untuk Kucing, Persia, dan Anjing
 * Nama Mahasiswa  : 24060124130075
 * Tanggal         : 05-05-2026
 */

class Anabul {
    protected String panggilan;
    protected double berat;

    public Anabul(String panggilan, double berat) {
        this.panggilan = panggilan;
        this.berat = berat;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public double getBerat() {
        return berat;
    }
}

// Subkelas Kucing (Anak)
class Kucing extends Anabul {
    public Kucing(String panggilan, double berat) {
        super(panggilan, berat);
    }
}

// Subkelas Persia (Cucu dari Kucing)
class Persia extends Kucing {
    public Persia(String panggilan, double berat) {
        super(panggilan, berat);
    }
}

// Subkelas Anjing (Anak)
class Anjing extends Anabul {
    public Anjing(String panggilan, double berat) {
        super(panggilan, berat);
    }
}