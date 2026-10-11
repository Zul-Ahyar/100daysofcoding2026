public class Day41 {
    public static void main(String[] args) {

        double suhu = 30.5;

        if (suhu < 16) {
            System.out.println("Temperatur ruangan: Dingin");
        } else if (suhu <= 24) {
            System.out.println("Temperatur ruangan: Normal");
        } else {
            System.out.println("Temperatur ruangan: Panas");
        }
    }
}
