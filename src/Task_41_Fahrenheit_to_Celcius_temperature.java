import java.util.Scanner;

public class Task_41_Fahrenheit_to_Celcius_temperature {


    static  void temperature_convertor(float F){

        float C;

        C = (float) 5 /9 * (F - 32);

        System.out.println("The temperature in Celcius is = "+ C);
    }
    public static void main(String[] args) {

        // Formula:   for find Fahrenheit to celcius C = 5/9 x (F - 32)
        float F;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        F= scanner.nextFloat();

        temperature_convertor(F);

    }




}
