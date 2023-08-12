import java.util.*;
public class Steingq2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
       // System.out.println(a);

       String result = "";
       for(int i=0;i<a.length();i++){
        if(a.charAt(i) == 'e' ){
            result +='i';//yha toda comfusion h ki kse replace kar rha hai ye e ko i se
        }
        else{
            result += a.charAt(i);// result = result+achar(i)
        }

       }

System.out.println(result);

    }
}
