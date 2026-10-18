import java.util.Scanner;
public class Day47 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = z.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Hari Senin");
                System.out.println("Matakuliah: Mikrokontroler, Aljabar Linear, Pemrograman WEB");
                break;
            case 2:
                System.out.println("Hari Selasa");
                System.out.println("Matakuliah: Basis data");
                break;
            case 3:
                System.out.println("Hari Rabu");
                System.out.println("Matakuliah: Algoritma");
                break;
            case 4:
                System.out.println("Hari Kamis");
                System.out.println("Matakuliah: Kosong/Libur");
                break;
            case 5:
                System.out.println("Hari Jumat");
                System.out.println("Matakuliah: Interaksi Manusia Komputer, Grafika Komputer");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                System.out.println("Matakuliah: Kosong/Libur");
                break;
            case 7:
                System.out.println("Hari Minggu");
                System.out.println("Matakuliah: Kosong/Libur");
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }
    }
}
