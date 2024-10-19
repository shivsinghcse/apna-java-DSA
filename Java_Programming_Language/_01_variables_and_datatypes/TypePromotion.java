package Java_Programming_Language._01_variables_and_datatypes;

public class TypePromotion {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // char c = a - b; // error: possible lossy conversion cannot convert int to
        // char

        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(a);
        // System.out.println(a - b);

        // short a = 5;
        // byte b = 123;
        // char c = 'c';
        // short bt = (short) (a + b + c);

        // System.out.println(bt);

        byte b = 5;
        // b = b*2; // error: due to type promotion
        b = (byte) (b * 2);
    }
}
