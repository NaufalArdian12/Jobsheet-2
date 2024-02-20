// Kelas Buku
public class book13 {
    // Atribut
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    // Constructors
    public book13() {

    }

    public book13(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    book13 bukuNaufal = new book13("Judul Buku Naufal", "Pengarang Naufal", 250, 20, 80000);


    // Metode
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jumlah) {
        stok -= jumlah;
        System.out.println(jumlah + " buku terjual.");
    }

    void gantiHarga(int hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga buku berhasil diubah menjadi " + hargaBaru);
    }
}
\\