import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int[] nilai = new int[5];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = z.nextInt();
        }

        max = nilai[0];

        for (int i = 1; i < 5; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }

        System.out.println("Angka maksimalnya adalah: " + max);
    }
}
