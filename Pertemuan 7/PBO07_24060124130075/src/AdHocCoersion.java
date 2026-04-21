/* Nama File    : AdHocCoersion.java
 * Deskripsi    : Program untuk mengilustrasikan konsep polimorfisme ad hoc coersion dalam Java
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 21-04-2026
 */


public class AdHocCoersion {
    public static void jalankan() {
        System.out.println("--- Bagian I: Polimorfisme Ad Hoc Coersion ---");
        // 1a. Integer ke Karakter dan Real
        int nilaiInt = 65;
        System.out.println("Integer: " + nilaiInt);
        System.out.println("Karakter: " + (char) nilaiInt);
        System.out.println("Real: " + (double) nilaiInt);

        // 1b. Real ke Integer
        double nilaiReal = 65.9;
        int backToInt = (int) nilaiReal;
        System.out.println("Real " + nilaiReal + " dikonversi ke Integer: " + backToInt);

        // 1c. String Integer
        String X = "1234", Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S (Konkatenasi): " + S + ", Z (Penjumlahan): " + Z);

        // 1d. String Double
        String P = "12.34", Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R (Konkatenasi): " + R + ", D (Penjumlahan): " + D);

        // 1e & 1f. Konversi S ke Integer A dan kembali ke String T
        Integer A = Integer.valueOf(S);
        System.out.println("A (Hasil konversi S): " + A);
        String T = A.toString();
        System.out.println("T (Hasil konversi A): " + T);
    }
}