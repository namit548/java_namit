public class Recurssion_xPower {
    public static int calpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==0){
            return 0 ;
        }
        int xPownm1= calpower(x,n-1);
        int xPown = x* xPownm1;
        return xPown;
    }
    public static void main(String args[]){
        int x = 2,n= 5;
        int awns    = calpower(x,n);
        System.out.println(awns);
    }
    
}
