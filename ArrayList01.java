import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayList01 {
    public static void main(String args[]){
        ArrayList<Integer>list1 =new ArrayList<Integer>();
       
       //add element
        list1.add(6);
        list1.add(2);
        list1.add(5);
        System.out.println(list1);
       
        //GET Elements
        int element = list1.get(0);
        System.out.println(element);

        //add element in between 
        list1.add(1,3);//index,element 
        System.out.println(list1);    

        //set element or change element value
        list1.set(0,9);//index,element
        System.out.println(list1);

        //delete element
        list1.remove(3);//index
        System.out.println(list1);

        //size of array list
        int size = list1.size();
        System.out.println(size);

        //Loops in array list
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+"  ");
        }
        System.out.println();
       
        //sorting in arrayList 
        Collections.sort(list1);
        System.out.println(list1);
        
        //search index element
        int index = list1.indexOf(1);// here we just use "indexOf" to find the index of element 
        System.out.println("Index of 1 is"+ index);  

    }
}



