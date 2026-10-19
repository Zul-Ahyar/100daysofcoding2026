import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.println("==== KALKULATOR ====");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan:");
        int pilihan = z.nextInt();

        System.out.print("Masukkan angka pertama:\t");
        double angka1 = z.nextDouble();

        System.out.print("Masukkan angka pertama:\t");
        double angka2 = z.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            
            case 2:
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            
            case 3:
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            
            case 4:
                if (angka2 != 0){
                    System.out.println("Hasil: " + (angka1 / angka2));
                }else{
                    System.out.println("Tidak bisa membagi dengan nol");
                }
                break;
            
            default:
               System.out.println("Pilihan oprasi tidak tersedia!!!");
        }
    }
}
