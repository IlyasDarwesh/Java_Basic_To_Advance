public class Task_23_Multiplication_n_number {

    public static void main(String[] args) {
    // fix your n= any number, so you will get the table of that number

        int n=10;
        System.out.println("The table of n number");
        for( int i =1; i<=10;i++){

            int value=n*i;

            System.out.println(n + "x" + i + "=" + value);
        }
    }
}
