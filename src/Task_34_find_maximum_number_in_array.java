public class Task_34_find_maximum_number_in_array {

    public static void main(String[] args) {

        int max = 0;
        int[] value = {2, 5, 14, 33, 56, 3, 2, 4};


        for (int element: value) {
            if (element > max) {

                max = element;
            }
        }
        System.out.println("The maximum value in above array is : " + max);
    }
}
