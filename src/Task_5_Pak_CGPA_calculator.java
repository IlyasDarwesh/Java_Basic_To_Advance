import java.util.Scanner;

public class Task_5_Pak_CGPA_calculator {

    public static void main(String[] args) {
        /* Program we have to do is:
        CGPA= Total Grade Point Obtained/No. of Subjects.
         */
        float subject1,subject2,subject3;
        float CGPA;
        float gradepoint;


        Scanner value= new Scanner(System.in);
        System.out.print("Enter the value of subject 1:");
        subject1=value.nextFloat();
        System.out.print("Enter the value of subject 2:");
        subject2=value.nextFloat();
        System.out.print("Enter the value of subject 3:");
        subject3=value.nextFloat();
        gradepoint=subject1+subject2+subject3;
        //CGPA= Total Grade Point Obtained/No. of Subjects.
        CGPA=gradepoint/3;
        System.out.print("Total Cgpa of student is: "+ CGPA);

    }





    }


