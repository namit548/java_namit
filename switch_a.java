import java.text.DecimalFormatSymbols;
import java.util.*;
public class switch_a {
   public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int month = sc.nextInt();      
        switch(month){
            case 1:System.out.print("JAN");
            break;
            case 2:System.out.print("FEB");
            break;
            case 3:System.out.print("MAR");
            break;
            case 4:System.out.print("APR");
            break;
            case 5:System.out.print("MAY");
            break;
            case 6:System.out.print("JUN");
            break;
            case 7:System.out.print("JUL");
            break;
            case 8:System.out.print("AUG");
            break;
            case 9:System.out.print("SEP");
            break;
            case 10:System.out.print("OCT");
            break;
            case 11:System.out.print("NOV");
            break;
            case 12:System.out.print("DEC");
            break;
            default:System.out.print("Not found");
        }
    }
    
}
