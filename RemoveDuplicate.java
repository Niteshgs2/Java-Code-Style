import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nitesh on 3/24/2018.
 * Remove all Duplicate element in String
 */


public class RemoveDuplicate {
    public static void main(String args[]) {
        String s = "ABbcDC";
        String temp = "";

        HashMap<Character, Integer> aValue = new HashMap<>();
        Integer asci = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = Character.toLowerCase(s.charAt(i));

            if (aValue.containsKey(c)) {
                aValue.put(c, aValue.get(c) + 1);
            } else {
                aValue.put(c, 1);
            }
        }

        char x;
        for (int j = 0; j < s.length(); j++) {
            c = Character.toLowerCase(s.charAt(j));
            x = s.charAt(j);

            if (aValue.get(c).equals(1))
                temp += x;
        }

        System.out.println(temp);



    }
}


