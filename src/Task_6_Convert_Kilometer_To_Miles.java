import java.util.Scanner;

public class Task_6_Convert_Kilometer_To_Miles {

    public static void main(String[] args) {
        /* Information First
        1 kilometer is equal to 0.621371 miles
        1 mile is equal to 1.609344 kilometers
         */

        double miles=0.621371;

        int kilometer;

        double total;

        Scanner value= new Scanner(System.in);

        System.out.print("Enter the kilometers: ");

        kilometer=value.nextInt();

        total=kilometer*miles;

        System.out.print("Total kilometer is = "+ total);





    }
}
