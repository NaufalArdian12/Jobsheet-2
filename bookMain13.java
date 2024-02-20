// Kelas bookMain13
public class bookMain13 {
    public static void main(String[] args) {
        // Membuat objek Buku
        book13 bk1 = new book13();

        // Mengatur atribut Buku
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();

        // Menampilkan informasi awal
        bk1.tampilInformasi();

        // Menjual beberapa buku dan menampilkan informasi setelah penjualan
        bk1.terjual(5);

        // Mengubah harga buku dan menampilkan informasi setelah perubahan harga
        bk1.gantiHarga(60000);

        // Menampilkan informasi terakhir setelah perubahan harga
        bk1.tampilInformasi();

        book13 bk2 = new book13("Self Reward", "Mahera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
