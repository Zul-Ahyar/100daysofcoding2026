public class Day2 {

    public static void main(String[] args) {

        // Membuat variabel nama dengan tipe data String untuk menyimpan teks.
        String nama = "Zul";

        // Membuat variabel umur dengan tipe data int untuk menyimpan bilangan bulat.
        int umur = 19;

        // Membuat variabel tinggi dengan tipe data double untuk menyimpan angka desimal.
        double tinggi = 166.6;

        // Membuat variabel nim dengan tipe data String karena NIM berupa teks/karakter.
        String nim = "D0225007";

        // Membuat variabel prodi dengan tipe data String untuk menyimpan nama program studi.
        String prodi = "Informatika";

        // print() digunakan untuk menampilkan teks tanpa otomatis membuat baris baru.
        // \n digunakan untuk pindah ke baris berikutnya.
        System.out.print("Nama saya: " + nama + "\n");

        // println() digunakan untuk menampilkan teks kemudian pindah ke baris berikutnya.
        System.out.println("Umur saya: " + umur);

        // printf() digunakan untuk menampilkan data dengan format tertentu.
        // %.1f digunakan untuk menampilkan angka desimal dengan 1 angka di belakang koma.
        // %n digunakan untuk pindah ke baris berikutnya.
        System.out.printf("Tinggi saya: %.1f%n", tinggi);

        // println() digunakan untuk menampilkan NIM kemudian pindah ke baris berikutnya.
        System.out.println("Nim saya: " + nim);

        // %s digunakan untuk menampilkan data bertipe String.
        System.out.printf("Prodi saya: %s%n", prodi);
    }
}
