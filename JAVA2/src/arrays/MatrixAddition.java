/* OUTPUT:                                              c
         enter dimension:                          r--  |
             2 3
             Enter array a
             3 2 -1                 | 3 2 -1 | + | 9 -1 -3| = 3+9  2+(-1) (-1)+(-3) = 12  1  -4
             4 7  2                 | 4 7  2 |   | 4  5  6|   4+4   7+5      2+6      8   12  8
             Enter array b
             9 -1 -3
             4  5  6
             result array c is:
             12 1 -4
             8 12 8  */

package arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter dimension: ");
        int rows=obj.nextInt();
        int cols=obj.nextInt();
        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];
        System.out.println("Enter array a: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter array b: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=obj.nextInt();
            }
        }
        int c[][]=new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Result array c is: ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


//        Scanner obj=new Scanner(System.in);
//
//        System.out.println("enter dimension: ");
//        int rows = obj.nextInt();
//        int cols = obj.nextInt();
//
//        int a[][] = new int[rows][cols];  //+ - karna hai to dimension same hona chaye hai
//        int b[][] = new int[rows][cols];  //Space empty karge
//
//        System.out.println("Enter array a");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                a[i][j] = obj.nextInt();      //a
//            }
//        }
//
//        System.out.println("Enter array b");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                b[i][j] = obj.nextInt();       //b
//            }
//        }
//        int c[][] = new int[rows][cols];  // c ka liya space chod rahe hai
//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        System.out.println("result array c is: ");
//        for(int i=0;i<rows;i++) {
//            for (int j=0;j<cols;j++) {
//                 System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
