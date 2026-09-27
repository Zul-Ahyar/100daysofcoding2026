import java.util.Scanner;
public class Day26 {
    public static void main(String[]args){
        Scanner z = new Scanner(System.in);

        int tahunLahir = z.nextInt();
        int tahunSekarang = z.nextInt();

        int umur = tahunSekarang - tahunLahir;

        System.out.println("Umur: " + umur + " Tahun");
    }
}
