public class Task_32_add_two_matrices_2D_Array {

    public static void main(String[] args) {

        int [][] num = {{ 2,3,4} , {6,7,5}};
        int [][] num1 = {{ 5,8,9} , {4,2,1}};
        int [][] result = {{0,0,0} , {0,0,0}};


        for(int i=0; i<num.length;i++){
            for (int j=0; j<num[i].length; j++){

                result[i][j]= num[i][j]+num1[i][j];

                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");

        }

    }
}
