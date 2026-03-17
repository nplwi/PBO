public class MBangunDatar {
    public static void main(String[] args) {
        
        BangunDatar P1 = new Persegi(10, "Merah", "Solid");
        BangunDatar L1 = new Lingkaran(14, "Hijau", "Dotted");

        System.out.println("--- Perbandingan Luas ---");
        System.out.println("Apakah luas P1 == L1? " + P1.isEqualLuas(L1));

        System.out.println("\n--- Eksperimen IResize pada P1 ---");
        P1.printInfo();
        ((IResize)P1).zoomIn();
        System.out.println("Setelah Zoom In (Sisi jadi 11):");
        P1.printInfo();
    }
}