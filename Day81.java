import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("Semua nilainya:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }
    }
}
