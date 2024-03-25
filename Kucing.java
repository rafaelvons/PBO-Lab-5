public class Kucing {
    String nama;
    int umur;
    String jenisKelamin;
    String ras;
    String warnaBulu;

    public Kucing(String nama, int umur, String ras, String jenisKelamin, String warnaBulu) {
        this.nama = nama;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
        this.jenisKelamin = jenisKelamin;
        this.ras = ras;
    }

    // METHOD 1
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Ras: " + ras);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    // METHOD 2
    void makan() {
        System.out.println("Nyam.......nyam.........nyam");
    }

    // METHOD 3
    void mengeong() {
        System.out.println("Miawww...miawww.....miawww");
    }
    // Method 4

    void pup() {
        System.out.println("Kucing " + nama + " buang air besar di pasir...");
    }

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Oreo", 2, "Anggora", "Jantan", "Putih");
        Kucing kucing2 = new Kucing("Beigsn", 1, "Persian", "Betina", "Coklat");
        Kucing kucing3 = new Kucing("Dundung", 3, "Scottish Fold", "Betina", "Abu-abu");

        kucing1.tampilkanInfo();
        kucing1.makan();
        kucing1.mengeong();
        kucing1.pup();

        System.out.println("\n");

        kucing2.tampilkanInfo();
        kucing2.mengeong();
        kucing2.makan();
        kucing2.pup();

        System.out.println("\n");

        kucing3.tampilkanInfo();
        kucing3.makan();
        kucing3.mengeong();
        kucing3.pup();
    }

}