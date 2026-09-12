public class Day10 {

    public static void main(String[] args) {

        // byte untuk angka yang kecil.
        System.out.println("Byte    : " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);

        // short untuk angka yang rentangnya lebih besar dari byte.
        System.out.println("Short   : " + Short.MIN_VALUE + " sampai " + Short.MAX_VALUE);

        // int untuk angka bulat yang rentangnya lebih besar dari short.
        System.out.println("Int     : " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);

        // long untuk angka bulat yang rentangnya sangat besar.
        System.out.println("Long    : " + Long.MIN_VALUE + " sampai " + Long.MAX_VALUE);

        // float untuk menyimpan angka desimal.
        System.out.println("Float   : " + Float.MIN_VALUE + " sampai " + Float.MAX_VALUE);

        // double untuk menyimpan angka desimal dengan rentang yang lebih besar.
        System.out.println("Double  : " + Double.MIN_VALUE + " sampai " + Double.MAX_VALUE);

        // char digunakan untuk menyimpan satu karakter.
        System.out.println("Char    : " + (int) Character.MIN_VALUE + " sampai " + (int) Character.MAX_VALUE);

        // boolean hanya memiliki dua nilai yaitu true dan false.
        System.out.println("Boolean : " + Boolean.FALSE + " dan " + Boolean.TRUE);
    }
}
