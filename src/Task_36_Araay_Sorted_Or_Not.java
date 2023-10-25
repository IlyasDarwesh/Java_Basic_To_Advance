public class Task_36_Araay_Sorted_Or_Not {
    public static void main(String[] args) {

        boolean isSorted=true;

        int [] check={ 1,2,3,4,5,6,7,8};

        for(int i=0; i<check.length-1;i++ ){
            if (check[i]>check[i+1]){
                isSorted=false;
                break;
            }


        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else {
            System.out.println("Array is not Sorted");
        }

    }
}
