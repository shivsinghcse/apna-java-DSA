package Java_Programming_Language._05_Pattern_1;

public class Pattern4 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
