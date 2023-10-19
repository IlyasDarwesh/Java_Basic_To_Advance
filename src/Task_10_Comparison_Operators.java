import java.util.Scanner;

public class Task_10_Comparison_Operators {

    public static void main(String[] args) {


        int a=8;
        int b;

        System.out.print("Enter value of b = ");

        Scanner scanner= new Scanner(System.in);

        b= scanner.nextInt();


        System.out.println("The number is greater: "+ (b>a));



    }
}
