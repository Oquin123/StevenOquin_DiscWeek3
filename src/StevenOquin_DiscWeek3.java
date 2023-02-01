import java.util.InputMismatchException;
import java.util.Scanner;
public class StevenOquin_DiscWeek3 {

    public static void main(String[] args) {

        // Creating a int scanner
        Scanner scanint = new Scanner(System.in);

        //Prompting user for the following question.
        System.out.println("How old are you? ");

        //adding a try-catch block to catch the exception and display a message to the user to enter a valid age.
        try {
            int Age = scanint.nextInt();

            //Creating if-else statements to decide weather they were born in the 1900's or in the 2000's
            if (Age > 123)
                System.out.println("you were born before the 1900's");

            else if(Age >= 23)
                System.out.println("You were born in the 1900's.");

            else if (Age > 0)
                System.out.println("You were born in the 2000's.");

            else
                System.out.println("Please enter your age as a positive number.");

        } catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a positive whole number.");
        }
        System.out.println("i just figuered it ou");
        scanint.close();
    }
}