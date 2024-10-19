package Java_Programming_Language._03_Conditional_Statement;

public class LargestOfThree {
    public static void main(String[] args) {
        
    int num1 = 12;
    int num2 = 111;
    int num3 = 31;

    if(num1>=num2  && num1 >= num3){
       System.out.println("largest is num1");
    }else if(num2 >= num3){
        System.out.println("largest is num2");
    }else{
        System.out.println("largest is num3");
    }
    }
}
