import java.util.Scanner;

public class Task_17_IF_ELSE_Student_Pass_Fail {

    public static void main(String[] args) {

        //Program : Student Pass or fail Scenario
        // Total = 40% and 33% in each subject

        float Total_mark;
        int sub1, sub2,sub3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first subject mark no : ");
        sub1=scanner.nextInt();
        System.out.print("Enter Second subject mark no : ");
        sub2=scanner.nextInt();
        System.out.print("Enter Third subject mark no : ");
        sub3=scanner.nextInt();

        Total_mark= (sub1+sub2+sub3)/3;



        if(Total_mark>=40 && sub1 >=33 && sub2 >=33 && sub3 >= 33 ){

            System.out.println("Student is Pass!");
        } else {
            System.out.println("Student is Fail!");
        }
        System.out.println("Total is = " + Total_mark);
    }
}
