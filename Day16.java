public class Day16 {
    public static void main(String[] args) {
        int durasiLagu = 85;
        int menitLagu = durasiLagu / 60;
        int sisaDetikLagu = durasiLagu % 60;
        System.out.println("Durasi: " + menitLagu + " menit " + sisaDetikLagu + " detik");

        int nomorKupon = 50;
        boolean dapetDiskon = (nomorKupon % 10 == 0);
        System.out.println("Kupon " + nomorKupon + " diskon? " + dapetDiskon);

        int totalBarang = 23;
        int sisaBarang = totalBarang % 5;
        System.out.println("Sisa barang: " + sisaBarang + " biji");
    }
}
