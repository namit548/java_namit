import java.util.*;
public class array_qp2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number rows");
        int rows = sc.nextInt();

        System.out.print("Enter the number of column:");
        int column = sc.nextInt();
        int number[][] = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number for location finding:");
        int x = sc.nextInt();
        for(int i=0 ;i<rows;i++){
            for(int j=0;j<column;j++){
                if(number[i][j] == x){
                    System.out.println("x found at location("+i+","+j+")");
                }
            }
        }
        
        }
    }
