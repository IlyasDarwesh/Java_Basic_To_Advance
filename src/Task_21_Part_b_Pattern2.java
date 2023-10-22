public class Task_21_Part_b_Pattern2 {
    public static void main(String[] args) {


        String star = "*";
        int n=1;
        int i=5;
       while(i>=n) {
            for (int j=0; j<i; j++) {
                System.out.print(star);
            }
           i--;
            System.out.print("\n");
        }
    }
}
