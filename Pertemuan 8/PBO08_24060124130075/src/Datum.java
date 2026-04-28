/* Nama File    : Datum.java
 * Deskripsi    : Program untuk mengilustrasikan konsep kelas generik dengan kelas Datum yang memiliki atribut isi bertipe generik T
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 28-04-2026
 */

public class Datum<T> {
    private T isi;

    public T getIsi() { return isi; }
    public void setIsi(T isibaru) { this.isi = isibaru; }
}