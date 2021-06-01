package ifElse;
import java.util.Scanner;

public class IfElse {
    public static void main(String args[]) {
   /*   Scanner obj=new Scanner(System.in);
        System.out.println("Enter your salary");
        int sal,b;
        sal=obj.nextInt();
        if(sal>=1000){
            b=(sal*10)/100;
            sal=sal+b;
        }else{
           b=(sal*5)/100;
           sal=sal+b;
        }
        System.out.println("Your salary is "+sal);
    } */
                                          /*..........................................*/
   /*   int number=10;
        if(number>0){
            System.out.println("the number is positive");
        }
         else{
            System.out.println("the number is negative");
        }
        System.out.println("statement outside if-else");   */

                                           /*.........................................*/
   /*   Scanner obj=new Scanner(System.in);
        System.out.println("Enter your number");
        int number;
        number=obj.nextInt();
        if(number>0){
            System.out.println("number is +ve");
        }
        else{
            System.out.println("number is -ve");
        }
        System.out.println("statment outside if-else"); */

                                             /*........................................*/
   /*   int time=20;
        if(time<18){
            System.out.println("good morning");
        }else{
            System.out.println("good night");
        }     */

                                             /*........................................*/
/*      Scanner obj=new Scanner(System.in);
        System.out.println("Enter time");
        int time;
        time=obj.nextInt();
        if(time<18){
            System.out.println("good morning");
        }else {
            System.out.println("good night");
        }   */

                                              /*.......................................*/
 /*     int time=20;
        String result=(time<18) ? "good morning": "good night";
        System.out.println(result); */
                                             /*.........................................*/

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of petals");
        int petals;
        petals=obj.nextInt();
        if(petals % 2 == 0){
            System.out.println("He loves me not");
        }else{
            System.out.println("He loves me");
        }

    }
}