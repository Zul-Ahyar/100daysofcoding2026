public class Day55 {
    public static void main(String[] args) {

        for (int z = 1; z <= 5; z++) {

            if (z == 2) {
                continue;
            }

            if (z == 4) {
                break;
            }

            System.out.println(z);
        }

        System.out.println("Perulangan selesai!");

        return;
    }
}
