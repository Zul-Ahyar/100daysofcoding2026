import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userAsli = "Jull";
        String passAsli = "2007";

        boolean belumLogin = true;

        while (belumLogin) {
            System.out.print("Username: ");
            String user = input.nextLine();
            System.out.print("Password: ");
            String pass = input.nextLine();

            if (user.equals(userAsli) && pass.equals(passAsli)) {
                System.out.println("Berhasil login, selamat datang Jull!");
                belumLogin = false;
            } else {
                System.out.println("Salah, silahkan coba lagi");
            }
        }
    }
}
