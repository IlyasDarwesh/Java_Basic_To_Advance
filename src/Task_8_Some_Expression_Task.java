import static java.lang.Math.pow;

public class Task_8_Some_Expression_Task {
    public static void main(String[] args) {
        /*
            1: x+y/2
            2: b^2 -4ac/2a
            3: v^2-u^2
            4: a*b-d
            5: float total=7/4 * 9/2
            6: v^2-u^2/2as
         */

        int a = 10, b = 4, c = 8, d = 4, x = 2, y = 6,v=2,u=3,s=12;
        int total,total3;
        double total1, total2,total5;
        float total4;

        // For first Expression

        total = (x + y) / 2;

        System.out.println("Expression 1st value is =  " + total);

        // For second Expression

        total1=(pow(b,2)-(4*a*c)) / (2*a);

        System.out.println("Expression 2nd value is: "+ total1);

        // For Third Expression
       total2 =pow(v, 2) - pow(u,2);

       System.out.println("Expression 3rd value is =  "+ total2);


        // For Fourth Expression

        total3= (a*b)-d;

        System.out.println("Expression 4th = "+ total3);


        // For Fifth Expression

        total4= ((float) 7 /4) * ((float) 9/2);

        System.out.println("Expression 5th = "+ total4);

            // For Sixth Expression

        total5= (pow(v,2) - pow(u,2))/(2*a*s);

        System.out.println("Expression 6th = "+ total5);



    }
}