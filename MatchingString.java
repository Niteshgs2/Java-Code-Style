

public class MatchingString {
    public static void main(String[] args)  {
        String input = "aacd";
        String ot = "cdaa";
        for (int i = 0; i < input.length(); i++) {
            input = shift(input);
            if (input.equals(ot))


                System.out.println("true");
        }
    }

    public static String shift(String s) {
        System.out.println(s.substring(1, s.length()) + String.valueOf(s.charAt(0)));
        return s.substring(1, s.length()) + (s.charAt(0));
    }
}