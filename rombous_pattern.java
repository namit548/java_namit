public class rombous_pattern {
    public static void main(String args[]){
        int n = 5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //we can use  j also in place of k 
        for(int k=1;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
       }
        }
    }