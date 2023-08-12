public class plandromin_pramid{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           for(int k=i;k>=1;k--){
            System.out.print(k);
           }
           for(int p=2;p<=i;p++){
            System.out.print(p);
           }
            System.out.println();
        }
    }
}
