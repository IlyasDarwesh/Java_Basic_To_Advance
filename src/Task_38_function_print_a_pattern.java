public class Task_38_function_print_a_pattern {

    static void pattern_print(String a) {

     int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=i;j++){

                System.out.print(a);
            }
            System.out.print("\n");

        }
    }
        public static void main(String[] args) {
        /*  we are going to print following pattern through function
            *
            **
            ***
            ****
         */
            String a="*";
            pattern_print(a);

    }
}
