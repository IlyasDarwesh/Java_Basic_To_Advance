import java.util.Scanner;

public class Task_18_IF_ELSE_Income_Tax_Calculation {

    public static void main(String[] args) {

        /*
        Income Slab                 Tax
        2.5 Lakh - 5.0 Lakh          5%
        5.0 Lakh - 10.0 Lakh         20%
        Above 10.0 Lakh              30%
        */

        float monthly_salary;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the Monthly Salary: 2");
        monthly_salary= value.nextFloat();
        if (monthly_salary>2.5 && monthly_salary==5.0){

            System.out.println("He will pay 5% Tax");

        } else if (monthly_salary>5.0 && monthly_salary==10.0) {
            System.out.println("He will pay 20% Tax");

        } else if (monthly_salary>10.0) {
            System.out.println("He will pay 30% Tax");

        }else {
            System.out.println("He is not a tax payer Person");
        }
    }
}
