public class Task_27_Multiplication_number_Sum {

    public static void main(String[] args) {

        // here we are doing sum of number for table of 8
        int n=8;
        int result=0;
        System.out.println("The table of n number");

        for( int i =1; i<=10;i++){

            int value=n*i;

            result = result+value;

            System.out.println(n + "x" + i + "=" + value);
        }
        System.out.println("Sum of table 8 output are = " + result);
    }
}
