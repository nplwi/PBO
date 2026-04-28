/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Program untuk mengilustrasikan konsep kelas generik dengan kelas OperatorGenerik yang memiliki prosedur generik Tukar untuk menukar isi dua variabel dan fungsi generik Bobot2 untuk menghitung jumlah bobot dua objek Kucing
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 28-04-2026
 */

public class OperatorGenerik {
    
    public <T> void Tukar(T[] arr) {
        if (arr.length >= 2) {
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    public <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}