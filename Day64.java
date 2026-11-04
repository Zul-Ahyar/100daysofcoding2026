import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = z.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Hasil faktorial: " + faktorial);

    }
}
