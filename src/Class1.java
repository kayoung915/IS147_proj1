/**
 * name : Kayoung Kim
 * email : kayoung2@umbc.edu
 Use Scanner class to take following user inputs
 Name,
 age,
 hours,
 payRate, grosspay
find grosspay
 Print details information back to the users
 How to submit lab?
 Please write your fullname, email on top of your file using comment tag.
 Compile and run your program,enter all the inputs as required.
 Take a screenshot of your result.
 Zip your project with screenshot and upload on Blackboard
 COMMAND + SHIFT + 3
 */
//This program prints Welcome to Java! and programmer's name
import java.util.Scanner; // Scanner is in the java.util package

public class Class1 {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("How many hours do you work? : ");
        int hours = input.nextInt();

        System.out.print("Enter pay rate($/hr): ");
        float payRate = input.nextFloat();



        //Display
        System.out.println("User name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Total hours: " + hours);
        System.out.println("Pay rate: " + payRate);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}


