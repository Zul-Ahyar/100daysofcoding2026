import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = z.nextLine();

        System.out.println("Apakah namamu Jull? " + nama.equals("Jull"));
        System.out.println("Apakah namamu jull (tidak peduli besar kecil)? " + nama.equalsIgnoreCase("jull"));
        System.out.println("Apakah namamu mengandung 'ul'? " + nama.contains("ul"));
        System.out.println("Apakah kamu tidak isi nama? " + nama.isEmpty());
    }
}
