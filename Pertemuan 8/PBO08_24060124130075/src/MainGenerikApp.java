/* Nama File    : MainGenerikApp.java
 * Deskripsi    : Program untuk mengilustrasikan konsep kelas generik dengan aplikasi Datum, OperatorGenerik, dan Data
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 28-04-2026
 */

public class MainGenerikApp {
    public static void main(String[] args) {
        
        // --- APLIKASI BAGIAN I (Datum) ---
        System.out.println("=== I. KELAS GENERIK DATUM ===");
        Datum<Anabul> kotakAnabul = new Datum<>();
        kotakAnabul.setIsi(new Kucing("Meong", 3.5));
        System.out.println("Isi Datum: " + kotakAnabul.getIsi().getNama());

        // --- APLIKASI BAGIAN II (Operator) ---
        System.out.println("\n=== II. OPERATOR GENERIK ===");
        OperatorGenerik op = new OperatorGenerik();
        
        // Tukar Integer
        Integer[] angka = {3, 6};
        System.out.print("Awal: " + angka[0] + "," + angka[1]);
        op.Tukar(angka);
        System.out.println(" | Tukar: " + angka[0] + "," + angka[1]);

        // Tukar Anabul (Kucing & Anjing)
        Anabul[] pets = { new Kucing("Kitty", 2.0), new Anabul("Doggo") };
        System.out.print("Awal: " + pets[0].getNama() + "," + pets[1].getNama());
        op.Tukar(pets);
        System.out.println(" | Tukar: " + pets[0].getNama() + "," + pets[1].getNama());

        // Hitung Bobot2 (Anggora & Kembangtelon)
        Anggora a1 = new Anggora("Putih", 4.2);
        Kembangtelon k1 = new Kembangtelon("Belang", 3.8);
        double totalBobot = op.Bobot2(a1, k1);
        System.out.println("Total Bobot 2 Kucing: " + totalBobot + " kg");

        // --- APLIKASI BAGIAN III (Larik/Data) ---
        System.out.println("\n=== III. LARIK GENERIK DATA ===");
        Data<Anabul> gudangAnabul = new Data<>();
        
        gudangAnabul.setIsi(1, new Anggora("Snowy", 4.0)); // 4b
        gudangAnabul.setIsi(2, new Kembangtelon("Muezza", 3.5));
        
        System.out.println("Elemen posisi 1: " + gudangAnabul.getIsi(1)); // 4c
        System.out.println("Elemen posisi 2: " + gudangAnabul.getIsi(2));
        System.out.println("Banyak elemen (Size): " + gudangAnabul.getSize()); // 4d
    }
}

