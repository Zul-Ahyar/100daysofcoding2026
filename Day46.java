import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        Scanner z = new  Scanner(System.in);

        System.out.println("==== DAFTAR MENU ====");
        System.out.println("Jepa     :Rp10.000");
        System.out.println("Gogos    :Rp5000");
        System.out.println("Bau Peapi:Rp15.000");

        System.out.print("Daftar Menu:");
        int menu = z.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Jepa:Rp10.000");
                break;
            case 2:
                System.out.println("Gogos:Rp5000");
                break;
            case 3:
                System.out.println("Bau Peapi:Rp15.000");
                break;
            default:
                System.out.println("Silahkan pilih menu yang tersedia");
        }
    }
}
