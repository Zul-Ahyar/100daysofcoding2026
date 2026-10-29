import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = input.nextInt();

        System.out.print("Angka Ganjil: ");
        for (int z = 1; z < N; z++) {
            if (z % 2 != 0) {
                System.out.print(z + " ");
            }
        }

        System.out.print("Angka Genap: ");
        for (int z = 1; z < N; z++) {
            if (z % 2 == 0) {
                System.out.print(z + " ");
            }
        }
    }
}
