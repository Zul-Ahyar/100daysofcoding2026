import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = z.nextLine();

        System.out.println("Panjang nama: " + nama.length() + " huruf");
        System.out.println("Huruf besar semua: " + nama.toUpperCase());
        System.out.println("Huruf kecil semua: " + nama.toLowerCase());
    }
}
