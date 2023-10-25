
public class Task_41_Average_of_nums_passed_as_argument {

    static  void average_number(float a, float b, float c, float d){
        float avg;
        avg=a+b+c+d/4;
        System.out.println("The Average of passing argument from main is = " + avg);

    }

    public static void main(String[] args) {

        // finding the Average of number passed as argument

     average_number(70,69,95,91);
    }
}
