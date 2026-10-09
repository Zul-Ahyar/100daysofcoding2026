public class Day38 {
    public static void main(String[] args) {
   
        int pilihan = 2;
        
        System.out.println("--- Menu Warkop ---");

        if (pilihan == 1) {
            System.out.println("Pesanan: Kopi Hitam");
        } else if (pilihan == 2) {
            System.out.println("Pesanan: Indomie Goreng");
        } else if (pilihan == 3) {
            System.out.println("Pesanan: Roti Bakar");
        } else {
            System.out.println("Maaf, pilihan tidak ada di daftar");
        }
    }
}
