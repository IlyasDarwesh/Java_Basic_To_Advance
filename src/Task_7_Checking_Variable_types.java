import java.util.Scanner;

public class Task_7_Checking_Variable_types {

    public static void main(String[] args) {

        /*
           Checking all variable type it is giving true or false
            when we try to ask number is int string or double

         */
        boolean finder,finder1;

        // Checking for integer number
        Scanner checker= new Scanner(System.in);
        System.out.print("Enter the value:");
        finder=checker.hasNextInt();
        System.out.println("The value is : " + finder);

        // Checking for String
        Scanner some= new Scanner(System.in);
        System.out.print("Enter the next value:");
        finder1=some.hasNextDouble();
        System.out.println("The  Double value is : " + finder1);


        Scanner hit= new Scanner(System.in);
        System.out.print("Enter the next value:");
        finder1=hit.hasNextLine();
        System.out.println("The  Double value is : " + finder1);






    }
}

