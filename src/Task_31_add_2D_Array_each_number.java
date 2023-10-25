public class Task_31_add_2D_Array_each_number {
    public static void main(String[] args) {

        // To add two matrices of size 2 X 3

        int sum = 0;
        int [][] matrix= new int[2][3];
        matrix[0][0]=10;
        matrix[0][1]=20;
        matrix[0][2]=30;
        matrix[1][0]=40;
        matrix[1][1]=50;
        matrix[1][2]=60;

        for (int i=0; i<matrix.length;i++) {
            for (int j = 0; j <matrix[i].length; j++) {

                System.out.println("the index at :" + i + " "+  j);
                sum = sum + matrix[i][j];

            }
        }
        System.out.println(sum);


    }
}
