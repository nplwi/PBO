/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 03-03-2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    // Atribut 
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;  
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor tanpa parameter 
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>(); 
    }

    // Konstruktor dengan parameter 
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(); 
    }

    // Selektor dan Mutator untuk atribut dasar dan relasi 
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public Dosen getDosenWali() { return dosenWali; }
    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }

    public Kendaraan getKendaraan() { return kendaraan; }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }

    // Method untuk menambahkan mata kuliah [cite: 26, 27]
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // Method untuk mendapatkan jumlah SKS total 
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatKul) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    // Method untuk mendapatkan jumlah mata kuliah yang diambil 
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // Method untuk menampilkan info dasar mahasiswa 
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan detail komplit mahasiswa beserta relasinya [cite: 26, 27]
    public void printDetailMhs() {
        System.out.println("========== DETAIL MAHASISWA ==========");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("--------------------------------------");
        
        System.out.println("Dosen Wali : " + (dosenWali != null ? dosenWali.getNama() : "Belum ada"));
        System.out.println("Kendaraan  : " + (kendaraan != null ? kendaraan.getJenis() + " (" + kendaraan.getNoPlat() + ")" : "Tidak ada"));
        
        System.out.println("Daftar Mata Kuliah:");
        if (listMatKul.isEmpty()) {
            System.out.println("- Belum ada mata kuliah yang diambil");
        } else {
            for (int i = 0; i < listMatKul.size(); i++) {
                System.out.println((i + 1) + ". " + listMatKul.get(i).getNama() + " (" + listMatKul.get(i).getSks() + " SKS)");
            }
        }
        System.out.println("======================================");
    }
}