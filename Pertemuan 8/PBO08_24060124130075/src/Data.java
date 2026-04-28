/* Nama File    : Data.java
 * Deskripsi    : Program untuk mengilustrasikan konsep kelas generik dengan kelas Data yang memiliki atribut ruang berupa larik statik 100 elemen bertipe generik T dan atribut banyak untuk menyimpan jumlah elemen yang terisi
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 28-04-2026
 */

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[101];
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi];
        }
        return null;
    }

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi] == null && objek != null) banyak++;
            else if (ruang[posisi] != null && objek == null) banyak--;
            
            ruang[posisi] = objek;
        }
    }

    public int getSize() {
        return banyak;
    }
}