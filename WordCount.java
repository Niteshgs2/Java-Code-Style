import javax.jws.soap.SOAPBinding;

/**
 * Created by Nitesh on 4/13/2018.
 */
import java.security.PublicKey;
import java.util.*;
import java.util.regex.*;
public class WordCount {
    public static void main(String args[])
    {
        String  s = "hello nitesh9 , how $ % @are 99 99 is nitesh is good good ";
      Pattern  p = Pattern.compile("[\\W]");
        countWord(s);
    }
    public static void countWord(String S){
        S = S.replaceAll("[\\W&&[^ ]]","");
        //   s =  .replaceAll("[^\\p{Alpha} ]","");
           S =S.replaceAll("\\s+"," ");
        System.out.println(S);
        HashMap <String,Integer> WCount = new HashMap<>();
        String[] result =S.split(" ");
        for (int i = 0 ; i< result.length; i++){
            if (WCount.containsKey(result[i])){
                WCount.put(result[i],WCount.get(result[i])+1);
            }
            else {
                WCount.put(result[i],1);
            }
        }
        for (Map.Entry m : WCount.entrySet())
         System.out.println(m.getKey() +" " + m.getValue());
    }
}
