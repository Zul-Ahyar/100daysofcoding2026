import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Angka 1 sampai N:");
        for (int z = 1; z <= n; z++) {
            System.out.println(z);
        }

        System.out.println("Angka N sampai 1:");
        for (int z = n; z >= 1; z--) {
            System.out.println(z);
        }

    }
}
