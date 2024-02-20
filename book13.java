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

    int hitungHargaTotal(int jumlahTerjual) {
        int hargaTotal = harga * jumlahTerjual;
        return hargaTotal;
    }

    double hitungDiskon(int hargaTotal) {
        double diskon = 0.0;

        if (hargaTotal > 150000) {
            diskon = 0.12; // Diskon 12%
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05; // Diskon 5%
        }

        return diskon;
    }

    double hitungHargaBayar(int jumlahTerjual){
        int hargaTotal = hitungHargaTotal(jumlahTerjual);
        double diskon = hitungDiskon(hargaTotal);
        
        double hargaDiskon = hargaTotal - (hargaTotal * diskon);
        return hargaDiskon;
    }

    // Contoh method hitungDiskon() dan hitungHargaBayar() bisa ditambahkan di sini

    public static void main(String[] args) {
        // Membuat objek Buku
        book13 bk1 = new book13("Today Ends Tomorrow Comes", "Denda Pratiwi", 198, 13, 71000);

        // Menjual beberapa buku dan menampilkan informasi setelah penjualan
        bk1.terjual(5);

        // Menghitung dan menampilkan harga total
        int jumlahTerjual = 5;
        int hargaTotal = bk1.hitungHargaTotal(jumlahTerjual);
        System.out.println("Harga Total: " + hargaTotal);

        // Menghitung dan menampilkan diskon
        double diskon = bk1.hitungDiskon(hargaTotal);
        System.out.println("Diskon: " + (diskon * 100) + "%");

        //Menghitung dan menamppilkan harga Bayar
        double hargaBayar = bk1.hitungHargaBayar(jumlahTerjual);
        System.out.println("Harga Bayar Setelah Diskon : " + hargaBayar);

    }
}
