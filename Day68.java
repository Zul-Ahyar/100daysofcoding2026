import java.util.Scanner;
public class Day68 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = z.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = z.nextInt();

        for(int w = 1; w <= lebar; w++){
            for(int x = 1; x <= panjang; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
