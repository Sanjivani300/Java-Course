/*      1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
        4 8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50
        6 12 18 24 30 36 42 48 54 60
        7 14 21 28 35 42 49 56 63 70
        8 16 24 32 40 48 56 64 72 80
        9 18 27 36 45 54 63 72 81 90
        10 20 30 40 50 60 70 80 90 100
        11 22 33 44 55 66 77 88 99 110
        12 24 36 48 60 72 84 96 108 120
        13 26 39 52 65 78 91 104 117 130
        14 28 42 56 70 84 98 112 126 140
        15 30 45 60 75 90 105 120 135 150
        16 32 48 64 80 96 112 128 144 160
        17 34 51 68 85 102 119 136 153 170
        18 36 54 72 90 108 126 144 162 180
        19 38 57 76 95 114 133 152 171 190
        20 40 60 80 100 120 140 160 180 200   */

/* int tableOf=2;
   for(int i=1;i<=10;i++){        //for table 0f 2
      System.out.println( tableOf * i);
   }  */
/* Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int result=1;                           .......taking table form user
        for(int i=1;i<=10;i++){
            result=n*i;
            System.out.print(result+" ");
        } */

package nestedForLoops;
import java.util.Scanner;
public class AssignmentTableFrom1to20 {
    public static void main(String args[]) {
        for(int i=1;i<=20;i++){       //20 time run hoga 1 to 10   //vertical line |
        for (int j = 1; j <= 10; j++) {      //horizontal line ---
            System.out.print(i * j + " ");
        }
        System.out.println();
        }
    }
}
