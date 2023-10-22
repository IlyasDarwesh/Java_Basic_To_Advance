public class Task_24_Multiplication_table_in_reverse {
    public static void main(String[] args) {

// fix your n= any number, Reverse your step i-- also initialize i=10
// so, you will get the table of that number in Reverse Order
        int n=10;

        System.out.println("The table of n number in Reverse Order");
        for( int i =10; i>=1;i--){

            int value=n*i;

            System.out.println(n + "x" + i + "=" + value);
        }
    }
}
