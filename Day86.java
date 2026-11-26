import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int[] nilai = new int[5];
        int cari = 0;
        boolean ketemu = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = z.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        cari = z.nextInt();

        for (int i = 0; i < 5; i++) {
            if (nilai[i] == cari) {
                System.out.println("Nilai " + cari + " ditemukan di posisi ke-" + (i + 1));
                ketemu = true;
            }
        }

        if (ketemu == false) {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
    }
}
