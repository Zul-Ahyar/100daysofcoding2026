import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap ta: ");
        String nama = input.nextLine();

        System.out.println("Nama asli: " + nama);
        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Huruf besar semua: " + nama.toUpperCase());
        System.out.println("Huruf kecil semua: " + nama.toLowerCase());
        System.out.println("3 huruf pertama: " + nama.substring(0, 3));
        System.out.println("Nama setelah diganti: " + nama.replace("a", "o"));
        System.out.println("Nama tanpa spasi depan belakang: " + nama.trim());
    }
}
