import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int[] nilai = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = z.nextInt();
        }

        System.out.println("Array awal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nilai[i] + " ");
        }

        for (int i = 0; i < 5; i++) {
            nilai[i] = nilai[i] * 2;
        }

        System.out.println("\nArray setelah dikali 2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}
