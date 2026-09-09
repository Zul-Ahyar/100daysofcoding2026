public class Day8 {

    public static void main(String[] args) {

        // Deklarasi: Cuma bikin tempat bernama 'umur' buat angka bulat, tapi belum diisi angka apa-apa
        int umur;

        // Inisialisasi: Baru di sini kita isi angkanya pertama kali, yaitu 19
        umur = 19;

        // Tampilkan teks + nilai awal ke layar, lalu otomatis pindah ke baris baru
        System.out.println("Umur sebelum update: " + umur);

        // Update: Nilai 19 yang lama kita ganti/timpa dengan angka baru, yaitu 20
        umur = 20;

        // Tampilkan lagi ke layar buat mastiin kalau angkanya sudah berubah jadi 20
        System.out.println("Umur sesudah update: " + umur);
    }
}
