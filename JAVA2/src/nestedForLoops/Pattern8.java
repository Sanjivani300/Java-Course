//              *
//              *  *                increasing i number of *
//              *  *  *                  . n=4  then,
//              *  *  *  *               . rows=2*n-1   7=rows ----
//              *  *  *             decreasing  rows-i+1
//              *  *                   7-5+1=3     7-6+1=2    7-7+1=1
//              *
package nestedForLoops;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int rows=2*n-1;
        for(int i=1;i<=rows;i++){
           if(i<=n){
               for(int j=1;j<=i;j++){
                   System.out.print("* ");
               }
           }else{
               for(int k=1;k<=rows-i+1;k++){        //rows-i+1  7-5+1=3  7-6+1=2  7-7+1=1
                   System.out.print("* ");
               }
           }
           System.out.println();
        }










//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
                 //.................
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
    }
}
