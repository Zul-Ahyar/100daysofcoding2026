import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiUTS = {85, 78, 92, 88, 90};

        System.out.print("Masukkan indeks (0-4): ");
        int z = input.nextInt();

        System.out.println("Nilai UTS pada indeks " + z + " adalah " + nilaiUTS[z]);
    }
}
