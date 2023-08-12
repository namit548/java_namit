import java.util.*;
public class FactorialRecursion {
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factor_number = calcfactorial(n-1);//yha par 5 hai toh 4 lega
        int factor_number2 = n*factor_number;//5 legae toh n-1 wala jo 4 h usse multiply hoga
        return factor_number2;//5*4=20 hoga
    }
    public static void main(String args[]){
        int n=5;
        int ans = calcfactorial(n);
        System.out.println(ans);       
    }
    
}
