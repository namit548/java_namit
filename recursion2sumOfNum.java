import java.util.*;
public class recursion2sumOfNum {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum = sum +i;
            System.out.println(sum);
            return;
        }
        sum = sum +i;
        printSum(i+1,n,sum);
        //empty
    }
    public static void main(String args[]){
        printSum(  1,5,0);
    }   
}
