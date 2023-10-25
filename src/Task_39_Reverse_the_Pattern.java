public class Task_39_Reverse_the_Pattern {

    static void pattern_print(String a) {

        int n=1;
        for (int i =4; i>=n; i--) {
            for (int j=1;j<=i;j++){

                System.out.print(a);
            }
            System.out.print("\n");

        }
    }
    public static void main(String[] args) {
        /*  we are going to print following pattern through function:
         ****
         ***
         **
         *

         */
        String a="*";
        pattern_print(a);

    }
}
