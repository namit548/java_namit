import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of a and b is "+ (a+b) );
        System.out.println("Subtraction of a and b is "+ (a-b) );
        System.out.println("Product of a and b is " +(a*b));
        System.out.println("Division of a and b is "+(a/b));
        System.out.println("Remainder of a and b is " +(a%b));
    }  
}
