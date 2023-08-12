import java.util.*;
public  class ArrayRowC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
       
        System.out.println("Enter number of columns:");
        int column = sc.nextInt();

        int[][] number = new int[rows][column];
        System.out.println("Enter elements of rows :");
                                                  //rows
        for(int i=0;i<rows;i++){
                                                   //columns
        for(int j=0;j<column;j++){
            number [i][j] = sc.nextInt();
        }
                                                    // System.out.println("Enter elements of array :");
        }
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
