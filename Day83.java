import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int[] nilai = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = z.nextInt();
            total = total + nilai[i];
        }

        System.out.println("Totalnya adalah: " + total);
    }
}
