// Q. Two numbers are entered through the keyboard, write a program to find the value of one number raised to the power of another (Do not use java built-in method)
// SOLUTION:- (ie. maths.pow v have to not use)
//       (a^b= a*a*a*a....b times   ,  a^2=a*a , a^3=a*a*a ) (3^2= 3*3= 9)
package loops;
import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int result = 1;

        for (int i = 0; i < b; i++) {         //i=0;i<2;i++     01   2 time it will run "0" "1"
            result = result * a;
        }
        System.out.println(result);
    }
}