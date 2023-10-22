public class Task_22_a_While_Loop_first_Even_Numbers {

    public static void main(String[] args) {

            // sum first n even number
        int n=20, i=1;
        int sum=0;

        while(i<n){

            System.out.println("value of i: "+i);

             sum = sum +i;

             i=i*2;
        }
        System.out.println("Sum is = "+sum);

    }
}
