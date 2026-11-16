import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = scanner.nextLine();

        // 1. substring()
        System.out.println("substring(0, 4): " + nama.substring(0, 4));

        // 2. replace()
        System.out.println("replace: " + nama.replace("a", "o"));

        // 3. trim()
        System.out.println("trim: '" + nama.trim() + "'");
    }
}
