import java.util.Scanner;

public class Task_4_Concatenation_Greeting_User_with_name {

    public static void main(String[] args) {

        /* Program we have to do is:
        Through Concatenation Method
        "Hello <name>, Have a Good day
         */

        String name;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter Your Good name please:");

        name=input.nextLine();

        System.out.print("Hello <" +name + ">, Have a Good day");
    }
}
