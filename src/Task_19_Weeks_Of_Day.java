import java.util.Scanner;

public class Task_19_Weeks_Of_Day {

    public static void main(String[] args) {

        // find out the day of week : 1 for Monday , 2 for Tuesday Up to so on

        int day;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");
        day= scan.nextInt();

        switch (day){

            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday! Funday");
        }

    }
}
