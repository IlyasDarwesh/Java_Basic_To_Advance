import java.util.Scanner;

public class Task_2_SImple_operators_Calculator {

    public static void Addition(){

        int a, b, c;
        System.out.print("Enter a value of a: ");
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        System.out.print("Enter a value of a: ");
        b = S.nextInt();
        c = a + b;
        System.out.print("The value of c= " + c);

    }

    public static void Subtraction(){

        int a, b, c;
        System.out.print("Enter a value of a: ");
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        System.out.print("Enter a value of a: ");
        b = S.nextInt();
        c = a - b;
        System.out.print("The value of c= " + c);
    }

    public static void Multiplication(){

        int a, b, c;
        System.out.print("Enter a value of a: ");
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        System.out.print("Enter a value of a: ");
        b = S.nextInt();
        c = a * b;
        System.out.print("The value of c= " + c);
    }

    public static void Division(){

        int a, b, c;
        System.out.print("Enter a value of a: ");
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        System.out.print("Enter a value of a: ");
        b = S.nextInt();
        c = a / b;
        System.out.print("The value of c= " + c);
    }
    public static void main(String[] args) {

        /* Program we have to do is:
        1: Addition
        2: Subtraction
        3: Multiplication
        4: Division
         */


        int  option;
        System.out.print("****** Simple JAVA Calculator **********\n\n");



        Scanner S = new Scanner(System.in);


        System.out.print("""
                Choose From below option:\s

                 1:Addition\s
                 2:Subtraction\s
                 3:Multiplication\s
                 4:Division
                """);

        System.out.print("Select the operation: ");

        option = S.nextInt();

        if (option == 1) {
            Addition();
        } else if (option == 2) {
            Subtraction();
        } else if (option == 3) {
            Multiplication();
        } else if (option == 4) {
            Division();
        } else {
            System.out.print("Sorry! No other Option");
        }
    }
}
