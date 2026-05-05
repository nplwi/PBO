/* 
 * NIM             : Naufal Dwi Yusmawan
 * Deskripsi       : Kelas Piaraan untuk mengelola antrean Anabul (Kucing, Persia, Anjing) menggunakan Queue
 * Nama Mahasiswa  : 24060124130075
 * Tanggal         : 05-05-2026
 */

import java.util.*;

class Piaraan {
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        // Menggunakan LinkedList sebagai implementasi Queue
        this.Lanabul = new LinkedList<>();
    }

    public int getNbelm() {
        return Lanabul.size();
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek(); // Mengintip elemen pertama tanpa menghapus
    }

    public Anabul dequeueAnabul() {
        return Lanabul.poll(); // Mengambil dan menghapus elemen pertama
    }

    public void showAnabul() {
        System.out.print("Daftar Nama Panggilan di Antrean: ");
        for (Anabul a : Lanabul) {
            System.out.print(a.getNama() + " ");
        }
        System.out.println();
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) { // Termasuk Kucing dan Persia (cucunya)
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += a.getBerat();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Detail Antrean (Nama - Jenis):");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (" + a.getClass().getSimpleName() + ")");
        }
    }
}
