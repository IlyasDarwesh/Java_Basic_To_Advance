public class Task_28_Array_sum_calculation {

    public static void main(String[] args) {
        // array of 5 float and calculate their sum

        float sum=0;
        float [] students_marks={ 85.75f,60.80f, 90.0f,75.25f,97.65f,52.50f };

        System.out.println(students_marks.length);

        for(int i=0; i<students_marks.length;i++){

            System.out.println("The value of Index "+ i + " "+ students_marks[i]);
            sum = sum + students_marks[i];

        }
        System.out.println("\n");
        System.out.println("The sum of array values = " + sum);

    }
}
