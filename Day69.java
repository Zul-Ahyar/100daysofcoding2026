import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int angka = input.nextInt();

        for (int z = 1; z <= angka; z++) {

            for (int n = 1; n <= z; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
