import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input 9 Tipe Data
        System.out.println("Masukkan Nama Lengkap:");
        String nama = input.nextLine();

        System.out.println("Masukkan Umur:");
        int umur = input.nextInt();

        System.out.println("Masukkan Tinggi Badan:");
        double tb = input.nextDouble();

        System.out.println("Masukkan Berat Badan:");
        float bb = input.nextFloat();
        
        System.out.println("Masukkan ID Anggota:");
        short idMember = input.nextShort();

        System.out.println("Masukkan Jumlah Saudara Kandung:");
        byte jumlahSaudara = input.nextByte();

        System.out.println("Masukkan NIK:");
        long nik = input.nextLong();

        System.out.println("Masukkan Golongan Darah:");
        char golDarah = input.next().charAt(0);

        System.out.println("Apakah Status Mahasiswa Aktif? (true/false):");
        boolean isAktif = input.nextBoolean();
    }
}
