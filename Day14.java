public class Day14 {

    public static void main(String[] args) {
        int uangAwal = 10000;
        int tambahanUang = 5000;
        int beliMakan = 10000;

        int totalUang = uangAwal + tambahanUang;
        int sisaUang = totalUang - beliMakan;

        System.out.println("Total uang setelah ditambah: Rp" + totalUang);
        System.out.println("Sisa uang setelah beli makan: Rp" + sisaUang);
    }
}
