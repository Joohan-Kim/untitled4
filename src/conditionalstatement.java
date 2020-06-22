import java.util.Random;
import java.util.Scanner;

public class conditionalstatement{
    /* Create your scanner
    Print the Scanner
    Set up a random variable
    Make a do loop
    Bound the random number between 1 and 137
    Print your number is
    then put statement weird or not weird after the method
    Ask to continue using while()
   */

    public static void main (String args[]) {
        //This is my setup for the Scanner and the random variable
        Scanner Input = new Scanner(System.in);
        Random number = new Random();
        String usersanswer;
        do { // this is my do loop, also this contains my if statements
            int n = number.nextInt(10 + 128);//  this is my statement that bounds the random variable from 1 to 137
            if (n != (n / 2) * 2) {
                System.out.println("your number is " + n); // this is my print statement that goes along with the random variable
                System.out.println("weird");
            } else if (n >= 2 && n <= 5 && n == (n / 2) * 2) {
                System.out.println("your number is " + n);
                System.out.println("weird");
            } else if (n >= 6 && n <= 20 && n == (n / 2) * 2) {
                System.out.println("your number is " + n);
                System.out.println("weird");
            } else if (n > 20 && n == (n / 2) * 2) {
                System.out.println("your number is " + n);
                System.out.println("not weird");
            }

            System.out.println("Continue?"); // this is my print statement for the user to continue
            usersanswer = Input.next();
        }
        while(usersanswer.contains("y")); // input y to continue

    }
}

