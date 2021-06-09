//            Column 1    Column 2    Column 3    Column 4
//   Rows 1    a[0][0]     a[0][1]     a[0][2]     a[0][3]
//   Rows 2    a[1][0]     a[1][1]     a[1][2]     a[1][3]
//   Rows 3    a[2][0]     a[2][1]     a[2][2]     a[2][3]

package arrays;
public class TwoDArrays {
    public static void main(String args[]){
        //..............DECLARATION............
//        int a[] = new int[5];         // 1D
//        int a[][] = new int[5][3];    //2D  // 5 array with l 3

        //..........ACCESS VALUE FROM ARRAY.........
//        int a[][] = new int[5][3];
//        System.out.println(a[2][1]);   // 3Row 2Column   ANS:0  coz v have not declare the value

        // ..........INSELATION.............
//        int b[]={3,5,8,4};   //1D
        int b[][]={{3,1,5,7,2},      //2D
                   {4,1,7},
                   {1,2,3,4,6,7}
                   };
//        System.out.println(b[0][2]);   //ANS: 5
//        System.out.println(b[1][2]);   //ANS: 7
          System.out.println(b[1][3]);   //ERROR

    }
}
