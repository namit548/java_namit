import java.util.*;
// add array as a string

public class ArrayLinked {
    public static void main(String args[]){
        LinkedList<String> list1 =new LinkedList<String>();
       // Scanner sc = new Scanner(System.in);
        list1.add("is");
        list1.addLast("a");
        list1.addFirst("this");
        list1.add("great");
        list1.add("code");
        list1.add(3,"by me");
        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.size());
        list1.remove(3);
        list1.removeFirst();
        list1.removeLast();
        
        System.out.println(list1);

    }
    
}
