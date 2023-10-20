import java.util.Scanner;

public class Task_16_IF_ELSE_simple_comparison {
    public static void main(String[] args) {
        /*
        Note: You can't use assign operator in if boxes like:
        if(a=10) it is wrong because you only use = for assign a value to any operator
        instead You use Relational Operator
        a=10 --> This is right
         */

        //Program : simple checking int value true or false

        int a=10;

        if(a==10){
            System.out.println("Yahoo! I am winner");
        } else {
            System.out.println("No, Its complicated");
        }

}
}