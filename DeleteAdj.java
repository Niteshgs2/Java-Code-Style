/**
 * Created by Nitesh on 3/23/2018.
 */
import java.util.*;
public class DeleteAdj {

    public static void main(String[] args) {
        String str1 = "aacVBcccdD";
        String str = str1.toLowerCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                str = str.substring(0, i - 1) + str.substring(i + 1);
            }
        }
        if (str.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(str);
        }
    }
}