import java.util.Scanner;
public class Day66 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = z.nextInt();

        for(int w = 1; w <= angka; w++){
            System.out.println("*");
        }
    }
}
