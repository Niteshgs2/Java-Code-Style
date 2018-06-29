/**
 * Created by Nitesh on 4/16/2018.
 */

import java.util.regex.*;
public class IPaddress {
    public static void main(String args[])
    {
        String s = "22.101.10.12       102.22.343.33   11.22336.444";


        System.out.println(Pattern.matches("\\b(\\d{1,3}\\.){3}\\d{1,3}\\b",s));

        Pattern p = Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}\\b");
        Matcher m = p.matcher(s);

        String tmp = "";
        while(m.find()){
          //  System.out.println(m.start() +" "  +m.end());
           tmp += (s.substring(m.start(),m.end()));
           tmp += " ";
        }

        System.out.println(tmp);


        }
    }

