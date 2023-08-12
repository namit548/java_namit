import java.util.*;
public class transpose_Matrix {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        int number[][]= new int [3][3];
        System.out.println("Enter array data");
                                 //i jo h 0 1 2 place pr input lega 
        for(int i=0;i<=2;i++){ 
            for(int j=0;j<=2;j++){
                number[i][j] = sc.nextInt();
            }

        }        //ham 2x2 kae degai [][] isami bhi agr 2x2 ka h toh and i ko2 start kregai jse i<=2
       
        System.out.println("Array formed is :");
        
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Transpose of this is:");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(number[j][i]+" ");
            }
            System.out.println();
        }
    }
}
