import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class StringBuilder2 {
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Jonny");
    System.out.println(sb);

    System.out.println(sb.charAt(0));// to change a specific  letter with other                                   
    sb.setCharAt(0, 't');// to change a specific  letter with other
    System.out.println(sb);

}    
}
