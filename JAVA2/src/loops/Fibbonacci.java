package loops;
import java.util.Scanner;

public class Fibbonacci {                       /*     6= 0 1 1 2 3 5     */
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no");

        int n=obj.nextInt();
        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=0; i<n-2; i++){     //01234
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
