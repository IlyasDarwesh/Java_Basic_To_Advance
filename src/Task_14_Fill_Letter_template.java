public class Task_14_Fill_Letter_template {

    public static void main(String[] args) {

        /* Fill letter template looks like

            letter= "Dear <|name|>, Thanks a lot"
        */

        String name="JACKY";
        String name2= "Dear <|name|>, Thanks a lot";


        // First way

        System.out.println("Dear <|"+name+"|>, Thanks a lot");

        // Second way

        name2=name2.replace("<|name|>","Jacky");

        System.out.println(name2);
    }
}
