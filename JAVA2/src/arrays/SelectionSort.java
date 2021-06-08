//                             SORTING
//                  .........(ii) SELECTION SORT...........
//     bubble sort mai jasa ek element duser sai big hai swaap kar date hai
//     selection sort pure array mai jata hai small element search karte hai or 1st position mai dalte hai ek baar swap karna hota hai puri itration mai 2nd itretion mai 2nd big number serach karte hai or position per dalte hai asa he haar itretion mai 1 baar swap karte ho
//     Sorting alg thoda improve hue
//        [5,2,-1,6,3]
// (1)  5,2,-1,6,3                        5 2 -1 6 3
// (2)  -1,2,5,6,3                        2 5 -1 6 3
// (3)  -1,2,5,6,3   //only one time     -1 5  2 6 3      -1 2 5 6 3
// (4)  -1,2,3,6,5                       -1 2 3 6 5
//
package arrays;

public class SelectionSort {
    public static void main(String args[]) {
//        int a[] = {5, 2, -1, 6, 3};     // 2 5 -1 6 3
//        int n = a.length;
//        for (int i = 0; i < n - 1; i++) {      // i=0    //(2) i=1   //(3) i=2n
//            int minInd = i;
//            for (int j = i; j < n; j++) {
//                if (a[j] < a[minInd]) {      //chota element dhund liya
//                    minInd = j;      //2 index (small index)  //choda vale index ko minInd mai dal diya
//                }
//            }
//            int temp = a[i];
//            a[i] = a[minInd]; //small index or a[i] ko swap kiya
//            a[minInd] = temp;
//        }                      //loop vapas chalga
//        for (int e : a) {
//            System.out.print(e+" ");
//        }
    }
}