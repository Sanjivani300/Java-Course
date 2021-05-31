//                 1                          -------1-------
//               2    3                       -----2----3----
//             4    5    6        ==>         --4----5----6--
//          7    8     9    10                7----8----9----10

package nestedForLoops;
import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(number++ +"   ");
            }
            System.out.println();
        }
    }
}
