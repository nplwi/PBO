/* 
 * NIM             : Naufal Dwi Yusmawan
 * Deskripsi       : Kelas Teman untuk mengelola daftar nama teman menggunakan List
 * Nama Mahasiswa  : 24060124130075
 * Tanggal         : 05-05-2026
 */

import java.util.*;

class Teman {
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
    }

    public int getNbelm() {
        return Lnama.size();
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return "Tidak Valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String namaLama, String namaBaru) {
        int index = Lnama.indexOf(namaLama);
        if (index != -1) {
            Lnama.set(index, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equalsIgnoreCase(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman: " + Lnama);
    }
}
