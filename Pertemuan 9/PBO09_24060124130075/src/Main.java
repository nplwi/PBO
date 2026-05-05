/* 
 * NIM             : Naufal Dwi Yusmawan
 * Deskripsi       : Kelas Main untuk menjalankan aplikasi Teman dan Piaraan
 * Nama Mahasiswa  : 24060124130075
 * Tanggal         : 05-05-2026
 */

public class Main {
    public static void main(String[] args) {
        mainTeman(args);
        System.out.println();
        mainPiaraan(args);
    }

    public static void mainTeman(String[] args) {
        Teman t = new Teman();
        t.addNama("Rayan");
        t.addNama("Naufal Dwi");
        t.addNama("Basil");
        t.addNama("Menza");
        t.addNama("Azka");
        t.addNama("Luthfi");
        t.addNama("Devano");
        t.addNama("Ferdy");
        t.addNama("Hanif");
        t.addNama("Hasta");
        t.addNama("Ali Maskan");
        t.addNama("Bayu");
        t.addNama("Caesar");
        t.addNama("Ghatfan");
        t.addNama("Izzatu");
        t.addNama("Dinda");
        t.addNama("Elza");
        t.addNama("Novelya");
        t.addNama("Rama");
        t.addNama("Marchella");
        
        t.showTeman();
        System.out.println("Jumlah elemen: " + t.getNbelm());
        System.out.println("Apakah Rayan ada? " + t.isMember("Rayan"));
        
        t.gantiNama("Rayan", "Atta");
        System.out.println("Rayan diganti Atta");
        t.showTeman();
        
        System.out.println("Jumlah nama 'Basil': " + t.countNama("Basil"));
        
        t.delNama("Basil");
        System.out.print("Setelah hapus satu 'Basil': ");
        t.showTeman();
    }



    public static void mainPiaraan(String[] args) {
        Piaraan klinik = new Piaraan();

        // Instansiasi berbagai objek
        Kucing k1 = new Kucing("Meong", 3.5);
        Persia p1 = new Persia("Snowy", 4.2);
        Anjing a1 = new Anjing("Rex", 10.0);
        Kucing k2 = new Kucing("Oyen", 5.0);

        // Menambah ke antrean
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(p1);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k2);

        // Menampilkan data
        klinik.showAnabul();
        klinik.showJenisAnabul();

        System.out.println("\n--- Statistik Kucing ---");
        System.out.println("Banyak keluarga kucing: " + klinik.countKucing());
        System.out.println("Total bobot keluarga kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\n--- Proses Antrean ---");
        System.out.println("Anabul pertama: " + klinik.getAnabul().getNama());
        
        Anabul diproses = klinik.dequeueAnabul();
        System.out.println("Memproses dan mengeluarkan: " + diproses.getNama());
        
        System.out.println("Sisa antrean: " + klinik.getNbelm());
        klinik.showAnabul();
    }
}

/*
Koleksi adalah cara mengelola sekumpulan data secara lebih efisien, terorganisir, 
dan otomatis dibandingkan menggunakan variabel tunggal atau array biasa. 
*/