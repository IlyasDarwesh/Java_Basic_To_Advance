import java.util.Scanner;

public class Task_37_methods_multiplication_of_table {

    static void Table_mul(int a){



        for (int i=1;i<=10;i++){

            int sum;
            sum=a*i;

            System.out.println(a + " X " + i + " = "  + sum);
        }

    }
    public static void main(String[] args) {

        // Method to print Multiplication table of number n
        int n;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number which table you want to print: ");
        n=scanner.nextInt();
        Table_mul(n);

    }
}
