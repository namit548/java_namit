import java.util.*;


public class SpiralOrderMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];
        for(int i = 0; i<m; i++){

            for(int j=0; j<n;j++);{
                matrix[m][n] = sc.nextInt();
            }
         }
         System.out.println("The sioral order of matrix is :");        

        int rowStart = 0;
        int rowEnd= m-1;
        int colStart= 0; 
        int colEnd= n-1; 
        while(rowStart<= rowEnd &&  colStart<=colEnd){
            for(int col= colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col]+" ");
        }

        rowStart++;

        for(int row= rowStart;row<=rowEnd;row++){
            System.out.print(matrix[row][colEnd]+ " ");
        }
        colEnd--;

        for(int col= colEnd;col>=colStart; col--){
            System.out.print(matrix[rowEnd][col]+ " ");
        }
        rowEnd--;
    for(int row=rowEnd;row>=rowStart;row--){
        System.out.print(matrix[row][rowStart]+ " ");
    }
    colStart++;
    System.out.println();
    }
}
}
