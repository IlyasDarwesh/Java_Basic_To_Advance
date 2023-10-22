public class Task_21_Part_a_Loops_Pattern {

    public static void main(String[] args) {
        /*
            Print *****
                  ****
                  ***
                  **
                  *
         */

        String star = "*";
        for (int i=5; i>0; i--) {

            for (int j=0; j<i; j++) {
                System.out.print(star);
            }
            System.out.print("\n");
        }

    }
}
