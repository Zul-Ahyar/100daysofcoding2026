public class Day15 {
    public static void main(String[] args) {
        int hargaPulpen = 5000;
        int hargaPensil = 3000;

        int jumlahPulpen = 5;
        int jumlahPensil = 3;

        int totalPulpen = hargaPulpen * jumlahPulpen;
        int totalPensil = jumlahPensil * hargaPensil;

        System.out.println("==== PERKALIAN ====");
        System.out.println("Total keseluruhan harga pulpen: Rp" + totalPulpen);
        System.out.println("Total keseluruhan harga pensil: Rp" + totalPensil);

        int jumlahUang = 50000;
        int jumlahOrang = 5;

        int hasilPerOrang = jumlahUang / jumlahOrang;

        System.out.println("==== PEMBAGIAN ====");
        System.out.println("Hasil per orang: Rp" + hasilPerOrang);
    }
}
