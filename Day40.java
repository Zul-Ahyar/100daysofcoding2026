import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka:");
        int angka = sc.nextInt();

        if (angka < - 100 && angka > 100){
            System.out.println("Angka diluar jangkauan (-100 s.d 100)!");
        }else if (angka == 0){
            System.out.println("Bilangan Netral (Nol)");
        }else {
            if (angka > 0){
                System.out.println("Bilangan positif - genap");
            }else{
                System.out.println("Bilangan Genatif - ganjil");
            }
        }
    }

}
