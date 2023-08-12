import java.util.*;
public class Stringq1 {
    public static void main(String args[]){
 
     Scanner sc = new Scanner (System.in);
     int size = sc.nextInt();
     String a[] = new String[size];
     int totLength = 0;


     for(int i=0; i<size; i++) {
       a[i] = sc.next();
       totLength += a[i].length();
     }


     System.out.println(totLength);
   }
}

    
