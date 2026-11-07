import java.util.Scanner;
public class Day67 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = z.nextInt();

        for(int w = 1; w <= angka; w++){
            for(int x = 1; x <= angka; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
