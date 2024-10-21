package Java_Programming_Language._05_Pattern_1;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
