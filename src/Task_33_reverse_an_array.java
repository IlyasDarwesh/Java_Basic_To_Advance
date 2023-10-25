public class Task_33_reverse_an_array {
    public static void main(String[] args) {

        // Printing numbers of array in reverse order

        int [] students_marks={ 85,65,25,58,74,58,12 };
        int l= students_marks.length;

        int n= Math.floorDiv(students_marks.length,2);
        int temp;

        for(int i=0; i<n; i++){
        // swap a[i] and a[l-1-i]
            // using temp logic for swap a number
            temp=students_marks[i];
            students_marks[i]= students_marks[l-i-1];
            students_marks[l-i-1]=temp;

        }
        for (int element: students_marks){
            System.out.print(element + " ");
        }

    }
}
