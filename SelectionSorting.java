import java.util.*;

public class SelectionSorting {
public static void printArray(int arr[]){
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String args[]){
        int arr[] = {1,2,3,34,43,4,6};

        for(int i = 0 ;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){    //here we use i+1 because we are sorting from starting (smaller in starting)

                if(arr[smallest]>arr[j]){
                    smallest= j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }
        printArray(arr);
    }

    
}
