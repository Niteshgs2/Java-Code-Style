import java.util.regex.Pattern;

/**
 * Created by Nitesh on 2/15/2018.
 */
public class ElementCount{
    public static void main(String args[]){
        String s = "aaabbcdda";
        printwrdCount(s);

        String s1 = s.replaceAll("(.)(\\1)+","$1");
        System.out.println(s1);
    }

    static void printwrdCount(String a){
        int i = 0;
        while (i < a.length())
        {
            int count= 0;
            char c = a.charAt(i);
            while( i<a.length() && c == a.charAt(i)){
                i++;
                count++;
            }
            System.out.print(String.valueOf(c) +count);
        }
        System.out.println();
    }
}
