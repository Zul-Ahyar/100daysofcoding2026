import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class Day11 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Menampilkan pesan petunjuk (prompt) ke konsol
        System.out.print("Masukkan nama anda: ");
        
        // Membaca teks satu baris penuh yang diinput pengguna
        String nama = input.nextLine();

        // Menampilkan hasil input menggunakan println
        System.out.println("Nama saya: " + nama);
    }
}
