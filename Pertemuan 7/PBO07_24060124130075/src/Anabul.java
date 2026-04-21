/* Nama File    : Anabul.java
 * Deskripsi    : Program untuk mengilustrasikan konsep polimorfisme dengan kelas Anabul dan turunannya (Kucing, Anjing, Burung)
 * Pembuat      : Naufal Dwi Yusmawan
 * Tanggal      : 21-04-2026
 */

class Anabul {
    protected String Nama;
    public void Gerak() { System.out.println("Anabul bergerak..."); }
    public void Bersuara() { System.out.println("Anabul bersuara..."); }
}

class Kucing extends Anabul {
    public Kucing(String n) { this.Nama = n; }
    @Override public void Gerak() { System.out.println(Nama + " (Kucing) bergerak melata."); }
    @Override public void Bersuara() { System.out.println(Nama + " (Kucing) berbunyi: Meong!"); }
}

class Anjing extends Anabul {
    public Anjing(String n) { this.Nama = n; }
    @Override public void Gerak() { System.out.println(Nama + " (Anjing) bergerak melata."); }
    @Override public void Bersuara() { System.out.println(Nama + " (Anjing) bersuara: Guk-guk!"); }
}

class Burung extends Anabul {
    public Burung(String n) { this.Nama = n; }
    @Override public void Gerak() { System.out.println(Nama + " (Burung) terbang."); }
    @Override public void Bersuara() { System.out.println(Nama + " (Burung) berbunyi: Cuit!"); }
}