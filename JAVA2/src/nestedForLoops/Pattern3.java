//        * * * * * *                  * * * * * *    1
//          * * * * *                  - * * * * *    2
//            * * * *       ==>        - - * * * *    3  (ya "n" time chala ga External loop)
//              * * *                  - - - * * *    4    i
//                * *                  - - - - * *    5    2(i-1)
//                  *                  - - - - - *    6
//                      (ander vala loop hai phala space print karga then * )
//
// i row ka liya kitna                i row ka liya kitna
// Space print hora hai               Star print hora hai
// 2(i-1)                             //(n-i+1)  //(6-1+1)=6  //(6-2+1)=5  //(6-3+1)=4  //(6-4+1)=3  //(6-5+1)=2  //(6-6+1)=1

package nestedForLoops;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String args[]) {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i-1;j++){
               System.out.print("  ");
           }
           for(int k=1;k<=n-i+1;k++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}