public class Day5 {

    public static void main(String[] args) {

        // double kita gunakan untuk menyimpan angka desimal.
        double tinggi = 166.6;

        // float juga digubnakan untuk menyimpan angka desimal, tapi yang membedakan dengan double yaitu huruf f. 
        // f menandakan kalau angka tersebut bertipe float.
        float berat = 60.5f;

        // printf digunakan untuk menampilkan output dengan format tertentu.
        // %.1f berarti menampilkan 1 angka di belakang koma. 
        // %n digunakan untuk pindah ke baris berikutnya.
        System.out.printf("Saya memiliki tinggi badan: %.1f%n", tinggi);
         System.out.printf("Berat badan saya: %.1f%n", berat);
        
    }
}
