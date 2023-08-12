import java.util.*;
public class ageInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}

