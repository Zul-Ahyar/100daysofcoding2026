public class Day39 {
    public static void main(String[] args) {

        int nilaiA = 16;
        int nilaiB = 2;
        char simbol = '*';

        if (simbol == '+') {
            System.out.println("Hasil: " + (nilaiA + nilaiB));
        } else if (simbol == '-') {
            System.out.println("Hasil: " + (nilaiA - nilaiB));
        } else if (simbol == '*') {
            System.out.println("Hasil: " + (nilaiA * nilaiB));
        } else if (simbol == '/') {
            System.out.println("Hasil: " + (nilaiA / nilaiB));
        } else {
            System.out.println("Operator tidak valid!");
        }
    }
}
