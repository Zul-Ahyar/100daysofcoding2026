import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        String inputJariJari = input.nextLine();

        int jariJariInt = Integer.parseInt(inputJariJari);
        double jariJari = jariJariInt;

        double luas = 3.14 * jariJari * jariJari;

        luas = luas - (luas * 2);

        String hasil = String.valueOf(luas);

        System.out.printf("Hasil: %s%n", hasil);
    }
}
