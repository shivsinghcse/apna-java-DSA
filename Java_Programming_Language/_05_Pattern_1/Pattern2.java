package Java_Programming_Language._05_Pattern_1;

public class Pattern2 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<= 4-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
