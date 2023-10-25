

public class Task_29_finding_integer_in_array {

    public static void main(String[] args) {
        // to find whether a given integer is present in an array or not

        int [] number;
        number= new int[6];
        number[0]=1;
        number[1]=10;
        number[2]=17;
        number[3]=8;
        number[4]=22;
        number[5]=19;

        for (int i=0; i< number.length;i++ ){

        if(number[i]==17){
            System.out.println("The value is exist at "+ i + " index and value is = " + number[i] );
            break;
        }else{
            System.out.println("Unable to find the number");
        }
        }

    }
}
