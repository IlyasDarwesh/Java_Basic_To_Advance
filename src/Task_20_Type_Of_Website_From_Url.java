import java.util.Scanner;

public class Task_20_Type_Of_Website_From_Url {

    public static void main(String[] args) {

        /* Type Of Website
                .com --> Commercial Website
                .org --> Organization Website
                .pk --> Pakistan Website
         */

        String web_name ;

        // we also use this method
        // if(web_name.endsWith(".org", ".pk", ".com"){ print()}

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Web extension: ");
        web_name= scanner.next();
        switch (web_name){
            case ".com":
                System.out.println("It is Commercial Website");
                break;
            case ".org":
                System.out.println("It is Organization Website");
                break;
            case ".pk":
                System.out.println("It is Pakistani Website");
                break;
            default:
                System.out.println("Other type Website");
        }

    }
}
