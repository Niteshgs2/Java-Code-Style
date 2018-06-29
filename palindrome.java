import java.util.Scanner;

/**
 * Created by Nitesh on 2/14/2017.
 */
import java.util.*;
public class palindrome{


    public static void main(String args[]) {
        String s = "MAYAM";

      s = s.replaceAll("[0-9]", "");
        s =  s.replaceAll("[\\W]","");
        String rev = new StringBuffer(s).reverse().toString();
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev))
            System.out.println("It is Palandrom");
         else
        System.out.println("Not A Palandrom");
    }
}