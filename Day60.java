import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = z.nextInt();

        int total = 0;

        for (int w = 1; w <= n; w++) {
            total += w;
        }
        System.out.println("Hasil penjumlahan: " + total);
    }
}
