import java.util.*;
public class ArratLinkedList1 {
    public static void main(String args[]){
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(5);
        list2.add(7);
        list2.add(3);
        list2.add(8);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        int index = list2.indexOf(7);// here we just use "indexOf" to find the index of element 
        System.out.println("Index of 7 is"+ index);  
    }
    
}
//https://docs.google.com/document/d/1ysYfkEEdeCRf1j8nGRvLCuPpEtN58Z51iMzgXB7pYIE/edit
//solved