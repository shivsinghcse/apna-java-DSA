package Java_Programming_Language._04_Loops;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Hello break :)" + i);
        }
    }
}
