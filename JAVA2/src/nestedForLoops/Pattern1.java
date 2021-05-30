//        * * * * *
//        * * * * *
//        * * * * *       5
//        * * * * *
//        * * * * *

package nestedForLoops;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){               //vertical line |   (2)
            for(int j=1;j<=n;j++){           //horizontal line ---  (1)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
