/**
 * name : Kayoung Kim
 * email : kayoung2@umbc.edu
**/
import java.util.Scanner; // Scanner is in the java.util package

public class Lab1 {

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

        //Calculate Gross pay
        float grossPay = hours * payRate;

        System.out.println();
        System.out.println("GrossPay : $ " + grossPay);


    }
}


