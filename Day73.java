import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Halo");
            System.out.println("2. Ngoding");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = z.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo, nama saya jull!");
                    break;

                case 2:
                    System.out.println("Sekarang dya73!");
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);
    }
}
