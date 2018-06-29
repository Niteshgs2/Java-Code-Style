/**
 * Created by Nitesh on 6/26/2017.
 */
import java.util.Random;
import java.util.Scanner;
public class HighLow {

    public static void main(String[] args) {
        String restart;
        int count1 = 0;
        int count2 = 0;
        int x ;
        while (true){
            Random myRandomNumber = new Random();
            Scanner scan = new Scanner(System.in);
            int myTwoDigitNumber1 = Math.abs(myRandomNumber.nextInt() % 100);
            int myTwoDigitNumber2 = Math.abs(myRandomNumber.nextInt() % 100);
            System.out.println("The Magic Number (this is just for verification) : " + myTwoDigitNumber1);
            do {
                System.out.println("Enter your guess or -1  to exit : ");
                x = scan.nextInt();
                if (x == -1)
                    break;
                count1++;
                if (x < myTwoDigitNumber1) {
                    System.out.println("Too low,  Try again");
                } else if (x > myTwoDigitNumber1) {
                    System.out.println("Too high, Try again");
                } else {
                    System.out.println("-->Correct, the number was " + myTwoDigitNumber1);
                    System.out.println("-->The Number of Guess  " + count1);
                }

            } while (x != myTwoDigitNumber1);
            System.out.println("***Thank you for playing.***");
            System.out.println("\nWould you like to play again? Press Y to play or any key to exit");
            restart = scan.next();
            if (restart.equalsIgnoreCase("Y")) {
                System.out.println("The Magic Number (this is just for verfication) : " + myTwoDigitNumber2);
                do {

                    System.out.println("Enter your guess or -1  to exit : ");
                    x = scan.nextInt();
                    if (x == -1)
                        break;
                    count2++;
                    if (x < myTwoDigitNumber2) {
                        System.out.println("Too low,  Try again");
                    } else if (x > myTwoDigitNumber2) {
                        System.out.println("Too high, Try again");
                    } else {
                        System.out.println("Correct, the number was " + myTwoDigitNumber2);
                        System.out.println(" The Number of Guess  " + count2);
                    }
                } while (x != myTwoDigitNumber2);
            } else
                System.exit(0);
            if (x == -1)
                break;
        }
    }
}

