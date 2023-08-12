import java.util.*;
public class ArrayLinkedList2 {
    public static void main(String args[]){
        LinkedList<Integer>list3 = new LinkedList<Integer>();
        Scanner sc =new Scanner(System.in);
       //input code
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        //condtion if number is greater than 50
       
       //data add code
        list3.add(a);
        list3.add(b);
        list3.add(c);
        list3.add(d);
      //condition
      System.out.println(list3);
       for(int i= 0;i<list3.size();i++){
        if((int)(list3.get(i))>25){
            list3.remove(i);
            i--;

        }
       }
                System.out.println("After the deleting smaller than 25 :"+list3);

            }
            //(this will print 3 times)System.out.println("After the deleting smaller than 25"+list3);

       
    }
    //https://docs.google.com/document/d/1ysYfkEEdeCRf1j8nGRvLCuPpEtN58Z51iMzgXB7pYIE/edit 
   // solved


