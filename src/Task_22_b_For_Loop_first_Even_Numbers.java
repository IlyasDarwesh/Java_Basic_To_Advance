public class Task_22_b_For_Loop_first_Even_Numbers {
    public static void main(String[] args) {

        int n=20;
        int sum=1;

        for (int i=1; i<n; i*=2){

            System.out.println("value of i: "+ i);

            sum = sum +i;

        }
        System.out.println("Sum is = "+sum);
    }
}
