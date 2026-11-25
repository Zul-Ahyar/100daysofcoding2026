import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int[] nilai = new int[5];
        int min = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = z.nextInt();
        }

        min = nilai[0];

        for (int i = 1; i < 5; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("Angka minimalnya adalah: " + min);
    }
}
