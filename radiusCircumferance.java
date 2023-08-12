import java.util.*;
public class radiusCircumferance {
    public static Double circumference(Double Radius){
        return 2 * 3.14 * Radius;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       Double r = sc.nextDouble() ; 
       System.out.println(circumference(r));

    }
    
}
