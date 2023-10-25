import java.util.Scanner;

public class Task_40_Recursive_Function_sum_of_n_natural_num {

  static void Natural_number(int n){




      int sum=0;

          if(n==0 || n==1){
              System.out.println("The number you entered is not a natural number" );

          }else{
              for (int i=1; i<=n; i++){
              System.out.println("The number selected are: "+ i);
              sum=sum+i;
          }


      }
      System.out.println("The sum of n natural numbers are: "+ sum );

  }

    public static void main(String[] args) {

        // A recursive function to calculate the sum of first n natural numbers

        int n;
        System.out.print("Enter the Number you want to sum: ");
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();

        Natural_number(n);

    }
}
