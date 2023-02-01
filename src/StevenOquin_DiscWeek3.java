/** name: Steven Oquin
class: CMIS 141/6380
Date: 01/31/2023
 This program prompts user for their age and displays if they are born before the 1900's, during the 1900's or in the
 2000's.
 **/

import java.util.InputMismatchException;
import java.util.Scanner;
public class StevenOquin_DiscWeek3 {

    public static void main(String[] args) {

        System.out.println("Name: Steven Oquin");
        System.out.println("Class: CMIS 141/6380");
        System.out.println("Date: 01/31/2023");
        System.out.println();

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
        scanint.close();
    }
}