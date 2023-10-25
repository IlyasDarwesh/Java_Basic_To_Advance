public class Task_30_Calculating_average_marks_from_array {
    public static void main(String[] args) {

        // the average mark from an array containing marks of all student in physics using
        // for-each loop

        int [] physics ={80,60,90,85,52,60,35,38,74,25};
        float result=0;
        for( int values: physics){

            result=(result+values);
        }
        result=result/physics.length;
        System.out.println("\n");
        System.out.println("The Average marks of Physics Students = "+result);
    }
}
