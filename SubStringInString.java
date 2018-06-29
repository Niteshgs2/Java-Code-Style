/**
 * Created by Nitesh on 4/14/2018.
 * BruteForce : Locating the index of small subString in Large String
 */
public class BruteFrc {
    public static void main(String Args[])
    {
        String S = "abcdbc";
        String s1 = "bc";
       int x [] =  BruteMatch(S,s1);
       for (int n : x)
        System.out.print(n + " ");
    }
    static int [] BruteMatch(String t, String p){
       for (int i = 0 ; i <= t.length()-p.length();i++)
        {
            int j = 0;
            while (j < p.length() && (t.charAt(i+j)== p.charAt(j)))
                  j++;
            if (j == p.length())
                 return new int[]{i,j};
        }
       return new int[]{0};
    }
}
