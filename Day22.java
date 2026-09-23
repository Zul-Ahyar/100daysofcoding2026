public class Day22 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int temp = y;
        y = x;
        x = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
