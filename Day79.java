public class Day79 {
    public static void main(String[] args) {
      
        String[] kata = {"Jull", "Anak", "Baik"};

        System.out.println("Daftar Kata:");

        for (int z = 0; z < kata.length; z++) {
            System.out.println((z + 1) + ". " + kata[z]);
        }

        System.out.println();
        System.out.println("Kata pertama: " + kata[0]);
        System.out.println("Kata terakhir: " + kata[2]);
    }
}
