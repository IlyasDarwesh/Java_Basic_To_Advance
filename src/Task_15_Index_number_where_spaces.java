public class Task_15_Index_number_where_spaces {


    public static void main(String[] args) {

        // we are giving spaces in string in system.out.print
        // Finding indexes where spaces Occurs

        String name= "Hey there what going   on, by the way i     jacky";

        System.out.println(name.indexOf("   "));

        System.out.println(name.indexOf("     "));

        System.out.println(name.indexOf("         "));

    }
}
