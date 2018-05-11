
import java.util.*;

/**
 * Created by Nitesh on 4/15/2017.
 */
public class anagram3 {

    static String sort_string(String a){
        String x = "";
        String[] temp = new String[a.length()];

        for(int j=0;j<a.length();j++){
            temp[j] = String.valueOf(a.charAt(j));

        }

        Arrays.sort(temp);

        for(String h: temp)
            x+=h;

        return x;



    }

    public static void main(String args[]){
        String[] word_list = { "pool", "cat","act","polo", "tip","pit"};





        HashMap<String,List<String>> anagram = new HashMap<String,List<String>>();

        for(int i=0;i<word_list.length;i++){

         String temp = sort_string(word_list[i]);



            if(anagram.containsKey(temp)){
//                List<String> l;
//                l = anagram.get(temp);
//                l.add(word_list[i]);
//                anagram.put(temp,l);
                anagram.get(temp).add(word_list[i]);



            }

            else{
                List<String> l = new LinkedList<String>();
                l.add(word_list[i]);
                anagram.put(temp,l);

                {

                }

            }
        }

        for (Map.Entry m : anagram.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());


        }


    }
}
