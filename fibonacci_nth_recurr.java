import java.util.*;
public class fibonacci_nth_recurr {
    public static void printFinoca(int a, int b, int n){
        if(n == 0){
        return;
    }
    int c= a+b;
    System.out.println(c);
    printFinoca(b,c,n-1);//1,1,6
    }
    public static void main(String args[]){
        int a= 0,b= 1;
        System.out.println(a);
        System.out.println(b);
        int n= 7;
        printFinoca(a,b,n-2);
    }    
}
