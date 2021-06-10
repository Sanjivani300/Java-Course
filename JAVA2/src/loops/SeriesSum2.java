//Q. SERIES SUM 2
//Compute the natural logarithm of 2, by adding up to n terms in the series 1 - 1/2 + 1/3 - 1/4 + 1/5 -....1/n where n is positive integer and input by user
//SOL:- 1-1/2+1/3-1/4+1/5-....1/n  jab bhi denominator no mai even(2,4) no is there then -ve is coming
// 1-1/2+1/3-1/4+1/5-....1/n = log e^2 hota hai
package loops;
import java.util.Scanner;

public class SeriesSum2 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no");
        int n = obj.nextInt();
        float result = 0;
        for(float i=1;i<=n;i++){
            if(i % 2 == 0){
                result = result - 1/i ;
            }else{
                result = result + 1/i ;
            }
        }
        System.out.println(result);

        //                        OR

//        Scanner obj = new Scanner(System.in);
//        int n = obj.nextInt();
//        float c = 0;
//        for (float i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                c = c - 1 / i;
//            }
//            if (i % 2 != 0) {
//                c = c + 1 / i;
//            }
//        }
//        System.out.print(c + " ");
    }
}
