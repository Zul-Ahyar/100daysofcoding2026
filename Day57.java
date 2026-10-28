import java.util.Scanner;
public class Day57 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Angka ganjil 1 sampai N:");
        for (int z = 1; z <= n; z++) {
            if (z % 2 != 0) {
                System.out.println(z);
            }
        }

        System.out.println("Angka genap N sampai 1:");
        for (int z = n; z >= 1; z--) {
            if (z % 2 == 0) {
                System.out.println(z);
            }
        }
    }
}
