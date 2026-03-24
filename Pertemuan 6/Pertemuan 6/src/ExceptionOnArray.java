/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 24-03-2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer dengan ukuran 4
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}