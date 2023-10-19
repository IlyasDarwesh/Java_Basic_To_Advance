import java.util.Scanner;

public class Task_3_Board_percentage_Calculation {
    public static void main(String[] args) {

       /* Program we have to do is:
        Calculate the Board Exam marks
         */

        int Math,Phy,Com,Isl,Urdu,Mark=550;

        //taking percentage in float
        float percentage;

        //Also taking Sum of marks in float/double Because mark obtained would be in decimal
        double sum;

        System.out.print("Enter the value of Subject Math=");

        // Scanner is used for taking input from user
        Scanner scr=new Scanner(System.in);
        Math=  scr.nextInt();

        System.out.print("Enter the value of Subject Phy=");
        Phy=  scr.nextInt();

        System.out.print("Enter the value of Subject Computer=");
        Com=  scr.nextInt();

        System.out.print("Enter the value of Subject Islamiat=");
        Isl=  scr.nextInt();

        System.out.print("Enter the value of Subject Urdu=");
        Urdu=  scr.nextInt();

        sum=  (Math+Phy+Com+Isl+Urdu);

        // Percentage Formula = Sum of obtained marks/Total Mark*100

        percentage= (int) (sum/Mark*100);

        System.out.println("The percentage of a student is: " + percentage);



    }
}
