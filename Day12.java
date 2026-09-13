import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Input teks (String)
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan nim: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan prodi: ");
        String prodi = input.nextLine();
        
        // Input angka bulat (int)
        System.out.print("Masukkan tahun angkatan anda: ");
        int tahun = input.nextInt();
        
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        
        // Input 1 karakter (char) menggunakan .next().charAt(0)
        System.out.print("Masukkan jenis kelamin anda: ");
        char jenisKelamin = input.next().charAt(0);
        
        // Input angka desimal (double)
        System.out.print("Masukkan biaya UKT: ");
        double ukt = input.nextDouble();
        
        // Input nilai kebenaran (boolean: true/false)
        System.out.print("Apakah benar ini biodata anda: ");
        boolean betul = input.nextBoolean();

        
        System.out.println("====== Data Mahasiswa ======");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Jurusan      : " + prodi);
        System.out.println("Angkatan     : " + tahun);
        System.out.println("Umur         : " + umur + " Tahun");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Biaya UKT    : " + ukt + " Juta");
        System.out.println("Status Aktif : " + betul);
        
    }
}
