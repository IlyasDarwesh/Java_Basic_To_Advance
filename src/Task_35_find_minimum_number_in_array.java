public class Task_35_find_minimum_number_in_array {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int[] value = {7, 33, 14,90, 1,-9, 56, 3, 99, 4};


        for (int element: value) {
            if ( element<min) {

                min = element;
            }
        }
        System.out.println("The minimum value in above array is : " + min);
    }
}
